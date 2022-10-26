package uia.com.agendafx.agendafx;


public class Recordatorio {

    private String tipoRecordatorio;
    private String nombreRecordatorio;
    private String fechaRecordatorioRec;
    private String fechaRec;


    public Recordatorio(String tipoRecordatorio, String nombreRecordatorio, String fechaRecordatorioRec, String fechaRec) {
        this.tipoRecordatorio = tipoRecordatorio;
        this.nombreRecordatorio = nombreRecordatorio;
        this.fechaRecordatorioRec = fechaRecordatorioRec;
        this.fechaRec = fechaRec;
    }

    public Recordatorio() {
    }


    public String getNombreRecordatorio() {
        return nombreRecordatorio;
    }

    public String getFechaRecordatorioRec() {
        return fechaRecordatorioRec;
    }

    public String getFechaRec() {
        return fechaRec;
    }

    public String getTipoRecordatorio() {
        return tipoRecordatorio;
    }


    public void setTipo(String text) {
        this.tipoRecordatorio = text;

    }

    public void setNombre(String text) {
        this.nombreRecordatorio = text;

    }

    public void setFecha(String text) {
        this.fechaRecordatorioRec = text;
    }

    public void setFechaRecordatorio(String text) {
        this.fechaRec = text;

    }

}

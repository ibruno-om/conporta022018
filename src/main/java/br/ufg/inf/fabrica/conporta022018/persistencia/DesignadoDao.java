public DesignadoDao extends GenericDao<Designado> {
    
    public List<Designado> pesquisaDesignadosSemCiencia(){
        StringBuilder builder = new StringBuilder();
        
        builder.append("select d from Designado d where d.dtCienciaDesig is null ");
        builder.append(" and d.portaria.status = :status ");
        
        Map<String, Object> parametros = new HashMap<String, Object>();
        
        parametros.put("status", StatusEnum.ATIVO);
        
        return this.pesquisarJPQLCustomizada(builder.toString(), parametros);
    }
    
}

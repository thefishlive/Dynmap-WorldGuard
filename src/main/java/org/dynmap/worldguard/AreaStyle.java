package org.dynmap.worldguard;

import org.bukkit.configuration.file.FileConfiguration;

public class AreaStyle {
	public String strokecolor;
	public String unownedstrokecolor;
	public double strokeopacity;
	public int strokeweight;
	public String fillcolor;
	public double fillopacity;
	public String label;

    public AreaStyle(FileConfiguration cfg, String path, AreaStyle def) {
        strokecolor = cfg.getString(path+".strokeColor", def.strokecolor);
        unownedstrokecolor = cfg.getString(path+".unownedStrokeColor", def.unownedstrokecolor);
        strokeopacity = cfg.getDouble(path+".strokeOpacity", def.strokeopacity);
        strokeweight = cfg.getInt(path+".strokeWeight", def.strokeweight);
        fillcolor = cfg.getString(path+".fillColor", def.fillcolor);
        fillopacity = cfg.getDouble(path+".fillOpacity", def.fillopacity);
        label = cfg.getString(path+".label", null);
    }

    public AreaStyle(FileConfiguration cfg, String path) {
        strokecolor = cfg.getString(path+".strokeColor", "#FF0000");
        unownedstrokecolor = cfg.getString(path+".unownedStrokeColor", "#00FF00");
        strokeopacity = cfg.getDouble(path+".strokeOpacity", 0.8);
        strokeweight = cfg.getInt(path+".strokeWeight", 3);
        fillcolor = cfg.getString(path+".fillColor", "#FF0000");
        fillopacity = cfg.getDouble(path+".fillOpacity", 0.35);
    }
}
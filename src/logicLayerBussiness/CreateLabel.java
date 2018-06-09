/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicLayerBussiness;

/**
 *
 * @author AxMCa
 */
public class CreateLabel {
    private String name;
    private int x;
    private int y;

    public CreateLabel(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
     
}

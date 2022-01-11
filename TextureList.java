public class TextureList {
 
 private int[][][] textures;
 
 public TextureList() {
  this.textures =  new int [][][]{    {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}},
        
              {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1},
            {1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1},
            {1,0,1,1,1,0,0,0,0,0,0,1,1,1,0,1},
            {1,0,0,1,1,1,0,0,0,0,1,1,1,0,0,1},
            {1,0,0,0,1,1,1,0,0,1,1,1,0,0,0,1},
            {1,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1},
            {1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1},
            {1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1},
            {1,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1},
            {1,0,0,0,1,1,1,0,0,1,1,1,0,0,0,1},
            {1,0,0,1,1,1,0,0,0,0,1,1,1,0,0,1},
            {1,0,1,1,1,0,0,0,0,0,0,1,1,1,0,1},
            {1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1},
            {1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}},
           
              {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
            {1,0,1,1,1,1,1,0,0,0,0,0,0,0,0,1},
            {1,0,1,1,0,1,1,0,1,1,1,1,1,1,0,1},
            {1,0,1,1,1,0,1,0,1,0,1,0,1,1,0,1},
            {1,0,1,0,1,1,1,0,1,1,1,1,1,1,0,1},
            {1,0,1,1,1,1,1,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,1,0,1,0,1,0,0,0,1,1,0,0,0,1},
            {1,0,1,0,1,0,1,0,0,1,0,0,1,0,0,1},
            {1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1},
            {1,0,1,0,1,0,1,0,1,0,1,1,0,1,0,1},
            {1,0,1,0,1,0,1,0,0,1,0,0,1,0,0,1},
            {1,0,1,0,1,0,1,0,0,0,1,1,0,0,0,1},
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}}, 
            
              {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,1},
            {1,0,0,1,0,0,0,0,0,0,0,0,1,0,0,1},
            {1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,1,1,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}},  
            
              {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1},
            {1,0,0,1,1,1,1,1,1,1,1,1,0,0,0,1},
            {1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,1},
            {1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,1},
            {1,0,0,1,1,1,1,1,1,1,1,1,0,0,0,1},
            {1,0,0,0,0,0,0,0,1,1,1,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}},
            
                 {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,},
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
            {1,0,0,0,1,1,0,0,0,0,1,1,0,0,0,1},
            {1,0,0,1,1,1,0,0,0,0,1,1,1,0,0,1},
            {1,0,1,1,1,1,1,0,0,1,1,1,1,1,0,1},
            {1,0,1,1,1,1,1,0,0,1,1,1,1,1,0,1},
            {1,0,0,0,1,1,0,0,0,0,1,1,0,0,0,1},
            {1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,0,1,1,0,0,0,0,0,0,1},
            {1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1},
            {1,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1},
            {1,0,0,0,0,1,1,1,1,1,1,0,0,0,0,1},
            {1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}},
                 
                 {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
            {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
            {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
            {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
            {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
            {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
            {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
            {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
            {1,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}}};
 }

 public int[][][] getTextures() {
  return textures;
 }
 
 public int[][] getSingleTexture(int index) {
  return textures[index];
 }
 
 public int getTextureTile(int index, int rows, int columns) {
  return textures[index][rows][columns];
 }
 
 public int getTextureRows(int index) {
  return textures[index].length;
 }
 
 public int getTextureColumns(int index) {
  return textures[index][0].length;
 }
}
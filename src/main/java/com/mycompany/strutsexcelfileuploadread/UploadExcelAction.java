/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.strutsexcelfileuploadread;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;


/**
 *
 * @author mritunjay
 */
public class UploadExcelAction extends ActionSupport{
    private File excelFile;
    private String excelFileContentType;
    private String excelFileFileName;
    
    
   

    
  
    public File getExcelFile() {
		return excelFile;
	}

	public void setExcelFile(File excelFile) {
		this.excelFile = excelFile;
	}

	public String getExcelFileContentType() {
		return excelFileContentType;
	}

	public void setExcelFileContentType(String excelFileContentType) {
		this.excelFileContentType = excelFileContentType;
	}

	public String getExcelFileFileName() {
		return excelFileFileName;
	}

	public void setExcelFileFileName(String excelFileFileName) {
		this.excelFileFileName = excelFileFileName;
	}

	@Override
    public void validate() {
        
    }

    @Override
    public String execute() throws Exception {
        
        return SUCCESS;
    }

    @Override
    public String input() throws Exception {
        if(excelFile!=null){
            System.out.print(excelFile);
            return SUCCESS;
        }else{
            return INPUT;
        }
    }
    
    
}

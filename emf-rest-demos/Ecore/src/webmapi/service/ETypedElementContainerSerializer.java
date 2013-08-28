package webmapi.service;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONWriter;

public final class ETypedElementContainerSerializer { 
 public static String serializeETypedElementContainerList(java.util.List obj, int depth, OutputStream out) throws RuntimeException {
        ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? new ByteArrayOutputStream() : out);
        JSONWriter jw = new JSONWriter(pw);
        jw.array();
        for (Object oi : obj) {
            generateJSONObject(jw, ( webmapi.service.container.ETypedElementContainer)oi, new HashMap<String, String>(), new StringBuffer(), depth);
        }
        jw.endArray();
        if (out == null) {
            try {
                return bStream.toString("utf-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        pw.flush();
        pw.close();
        return null;
    }


	public final static String serialize( webmapi.service.container.ETypedElementContainer obj, OutputStream out) throws RuntimeException {
		return serialize(obj, 0, out);
	}

	public final static String serialize( webmapi.service.container.ETypedElementContainer obj, int depth, OutputStream out) {
		ByteArrayOutputStream bStream = new ByteArrayOutputStream();
        PrintWriter pw = new PrintWriter(out == null ? bStream : out);
        JSONWriter jw = new JSONWriter(pw);
        generateJSONObject(jw, obj, new HashMap<String, String>(), new StringBuffer(), depth);
        if (out == null) {
            try {
                return bStream.toString("utf-8");
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } 
        pw.flush();
        pw.close();
        return null;
	}
   public final static void generateJSONObject(JSONWriter jw, webmapi.service.container.ETypedElementContainer obj, HashMap<String, String> serialized, StringBuffer path, int depth) {
     jw.object();
		if(obj == null){
		  jw.endObject();
		  return;
     }
     jw.key("EAttribute"); 
	 jw.array();
	 for (org.eclipse.emf.ecore.EAttribute obji : obj.getEAttribute()) {
		if (serialized.get("EAttribute"+IdentificationResolver.getEAttributeId(obji)) == null) {
			webmapi.service.EAttributeSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
			// put a reference???
		}
	 }
	 jw.endArray();	 
     jw.key("EOperation"); 
	 jw.array();
	 for (org.eclipse.emf.ecore.EOperation obji : obj.getEOperation()) {
		if (serialized.get("EOperation"+IdentificationResolver.getEOperationId(obji)) == null) {
			webmapi.service.EOperationSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
			// put a reference???
		}
	 }
	 jw.endArray();	 
     jw.key("EParameter"); 
	 jw.array();
	 for (org.eclipse.emf.ecore.EParameter obji : obj.getEParameter()) {
		if (serialized.get("EParameter"+IdentificationResolver.getEParameterId(obji)) == null) {
			webmapi.service.EParameterSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
			// put a reference???
		}
	 }
	 jw.endArray();	 
     jw.key("EReference"); 
	 jw.array();
	 for (org.eclipse.emf.ecore.EReference obji : obj.getEReference()) {
		if (serialized.get("EReference"+IdentificationResolver.getEReferenceId(obji)) == null) {
			webmapi.service.EReferenceSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
			// put a reference???
		}
	 }
	 jw.endArray();	 
     jw.key("EStructuralFeature"); 
	 jw.array();
	 for (org.eclipse.emf.ecore.EStructuralFeature obji : obj.getEStructuralFeature()) {
		if (serialized.get("EStructuralFeature"+IdentificationResolver.getEStructuralFeatureId(obji)) == null) {
			webmapi.service.EStructuralFeatureSerializer.generateJSONObject(jw, obji, serialized, path, depth - 1);
		}else{
			// put a reference???
		}
	 }
	 jw.endArray();	 
     jw.endObject();
    }
 }
 
 

package com.etaoin.myopengltest.util.gl;

import android.opengl.GLES20;

import java.nio.Buffer;
import java.nio.FloatBuffer;

/**
 * Wrapper for all the OpenGL ES 2.0 calls for debugging purposes.
 */
public class MyGLES20DebugAll extends MyGenericGLES20 {

	@Override
	public void glAttachShader(int program, int shader) {
		GLES20.glAttachShader(program, shader);
		checkGlError("glAttachShader");
	}

	@Override
	public void glClear(int mask) {
		GLES20.glClear(mask);
		checkGlError("glClear");
	}

	@Override
	public void glClearColor(float red, float green, float blue, float alpha) {
		GLES20.glClearColor(red, green, blue, alpha);
		checkGlError("glClearColor");
	}

	@Override
	public void glCompileShader(int shader) {
		GLES20.glCompileShader(shader);
		checkGlError("glCompileShader");
	}

	@Override
	public int glCreateProgram() {
		int program = GLES20.glCreateProgram();
		checkGlError("glCreateProgram");
		return program;
	}

	@Override
	public int glCreateShader(int type) {
		int shader = GLES20.glCreateShader(type);
		checkGlError("glCreateShader");
		return shader;
	}

	@Override
	public void glDrawElements(int mode, int count, int type, Buffer indices) {
		GLES20.glDrawElements(mode, count, type, indices);
		checkGlError("glDrawElements");
	}

	@Override
	public void glDrawElements(int mode, int count, int type, int offset) {
		GLES20.glDrawElements(mode, count, type, offset);
		checkGlError("glDrawElements");
	}

	@Override
	public void glEnableVertexAttribArray(int index) {
		GLES20.glEnableVertexAttribArray(index);
		checkGlError("glEnableVertexAttribArray");
	}

	@Override
	public int glGetAttribLocation(int program, String name) {
		int location = GLES20.glGetAttribLocation(program, name);
		checkGlError("glGetAttribLocation");
		return location;
	}

	@Override
	public int glGetUniformLocation(int program, String name) {
		int location = GLES20.glGetUniformLocation(program, name);
		checkGlError("glGetUniformLocation");
		return location;
	}

	@Override
	public void glLinkProgram(int program) {
		GLES20.glLinkProgram(program);
		checkGlError("glLinkProgram");
	}

	@Override
	public void glShaderSource(int shader, String source) {
		GLES20.glShaderSource(shader, source);
		checkGlError("glShaderSource");
	}

	@Override
	public void glUniform3fv(int location, int count, FloatBuffer v) {
 		GLES20.glUniform3fv(location, count, v);
		checkGlError("glUniform3fv");
	}

	@Override
	public void glUniform3fv(int location, int count, float[] value, int offset) {
		GLES20.glUniform3fv(location, count, value, offset);
		checkGlError("glUniform3fv");
	}

	@Override
	public void glUniform4fv(int location, int count, FloatBuffer v) {
 		GLES20.glUniform4fv(location, count, v);
		checkGlError("glUniform4fv");
	}

	@Override
	public void glUniform4fv(int location, int count, float[] value, int offset) {
		GLES20.glUniform4fv(location, count, value, offset);
		checkGlError("glUniform4fv");
	}

	@Override
	public void glUniformMatrix4fv(int location, int count, boolean transpose, FloatBuffer value) {
		GLES20.glUniformMatrix4fv(location, count, transpose, value);
		checkGlError("glUniformMatrix4fv");
	}

	@Override
	public void glUniformMatrix4fv(int location, int count, boolean transpose, float[] value, int offset) {
		GLES20.glUniformMatrix4fv(location, count, transpose, value, offset);
		checkGlError("glUniformMatrix4fv");
	}

	@Override
	public void glUseProgram(int program) {
		GLES20.glUseProgram(program);
		checkGlError("glUseProgram");
	}

	@Override
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, Buffer ptr) {
		GLES20.glVertexAttribPointer(index, size, type, normalized, stride, ptr);
		checkGlError("glVertexAttribPointer");
	}

	@Override
	public void glVertexAttribPointer(int index, int size, int type, boolean normalized, int stride, int offset) {
		GLES20.glVertexAttribPointer(index, size, type, normalized, stride, offset);
		checkGlError("glVertexAttribPointer");
	}

	@Override
	public void glViewport(int x, int y, int width, int height) {
		GLES20.glViewport(x, y, width, height);
		checkGlError("glViewport");
	}

	private void checkGlError(String glOperation) {
		int error;
		if ((error = GLES20.glGetError()) != GLES20.GL_NO_ERROR) {
			throw new RuntimeException(glOperation + ": glError " + error);
		}
	}
}

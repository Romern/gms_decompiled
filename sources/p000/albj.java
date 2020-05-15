package p000;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* renamed from: albj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class albj {

    /* renamed from: a */
    protected int f73285a;

    /* renamed from: b */
    protected int f73286b;

    /* renamed from: c */
    protected int f73287c;

    /* renamed from: d */
    protected int f73288d;

    /* renamed from: e */
    private int f73289e;

    /* renamed from: f */
    private String f73290f;

    public albj() {
        this.f73285a = -1;
        this.f73286b = -1;
        this.f73287c = -1;
    }

    /* renamed from: a */
    protected static int m60798a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            GLES20.glDeleteShader(glCreateShader);
            StringBuilder sb = new StringBuilder(36);
            sb.append("Unable to compile shader ");
            sb.append(i);
            throw new albh(sb.toString(), glGetShaderInfoLog);
        }
        throw new albh("Unable to create shader");
    }

    /* renamed from: b */
    protected static final int m60799b(int i, String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (glGetAttribLocation != -1) {
            albh.m60795a(str.length() == 0 ? new String("glGetAttribLocation ") : "glGetAttribLocation ".concat(str));
            return glGetAttribLocation;
        }
        StringBuilder sb = new StringBuilder(str.length() + 25);
        sb.append("Unable to find ");
        sb.append(str);
        sb.append(" in shader");
        throw new albh(sb.toString());
    }

    /* renamed from: c */
    protected static final int m60800c(int i, String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (glGetUniformLocation != -1) {
            albh.m60795a(str.length() == 0 ? new String("glGetUniformLocation ") : "glGetUniformLocation ".concat(str));
            return glGetUniformLocation;
        }
        StringBuilder sb = new StringBuilder(str.length() + 25);
        sb.append("Unable to find ");
        sb.append(str);
        sb.append(" in shader");
        throw new albh(sb.toString());
    }

    public albj(byte[] bArr) {
        this.f73285a = -1;
        this.f73286b = -1;
        this.f73287c = -1;
        this.f73289e = 0;
        this.f73290f = "precision highp float;                            \nuniform float uAlphaFactor;                         \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  vec4 texcolor;                                    \n  texcolor = texture2D( sTexture, vTexCoord );      \n  texcolor.a = uAlphaFactor;                        \n  gl_FragColor = texcolor;                          \n}                                                   \n";
        int a = m60798a(35633, "uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n");
        int a2 = m60798a(35632, "precision highp float;                            \nuniform float uAlphaFactor;                         \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  vec4 texcolor;                                    \n  texcolor = texture2D( sTexture, vTexCoord );      \n  texcolor.a = uAlphaFactor;                        \n  gl_FragColor = texcolor;                          \n}                                                   \n");
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, a);
            albh.m60795a("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, a2);
            albh.m60795a("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                this.f73288d = glCreateProgram;
                this.f73285a = m60799b(glCreateProgram, "aPosition");
                this.f73286b = m60799b(this.f73288d, "aTextureCoord");
                this.f73287c = m60800c(this.f73288d, "uMvpMatrix");
                this.f73289e = m60800c(this.f73288d, "uAlphaFactor");
                mo40089a();
                GLES20.glUniform1f(this.f73289e, 0.9f);
                return;
            }
            GLES20.glDeleteProgram(glCreateProgram);
            throw new albh("Could not link program", GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        throw new albh("Unable to create program");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.opengl.GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer):void}
     arg types: [int, int, int, int, int, java.nio.FloatBuffer]
     candidates:
      ClspMth{android.opengl.GLES20.glVertexAttribPointer(int, int, int, boolean, int, int):void}
      ClspMth{android.opengl.GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer):void} */
    /* renamed from: b */
    public final void mo40093b(FloatBuffer floatBuffer) {
        int i = this.f73286b;
        if (i >= 0) {
            GLES20.glVertexAttribPointer(i, 2, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f73286b);
        }
    }

    /* renamed from: a */
    public final void mo40089a() {
        GLES20.glUseProgram(this.f73288d);
    }

    /* renamed from: a */
    public final void mo40090a(float f) {
        GLES20.glUniform1f(this.f73289e, f);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.opengl.GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer):void}
     arg types: [int, int, int, int, int, java.nio.FloatBuffer]
     candidates:
      ClspMth{android.opengl.GLES20.glVertexAttribPointer(int, int, int, boolean, int, int):void}
      ClspMth{android.opengl.GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer):void} */
    /* renamed from: a */
    public final void mo40091a(FloatBuffer floatBuffer) {
        int i = this.f73285a;
        if (i >= 0) {
            GLES20.glVertexAttribPointer(i, 3, 5126, false, 12, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f73285a);
        }
    }

    /* renamed from: a */
    public final void mo40092a(float[] fArr) {
        int i = this.f73287c;
        if (i >= 0) {
            GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
        }
    }
}

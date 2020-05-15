package p000;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.animation.Animation;
import com.google.android.gms.car.CarWindowManagerLayoutParams;
import com.google.android.gms.car.DrawingSpec;
import com.google.android.gms.car.InputFocusChangedEvent;
import com.google.android.gms.car.TouchEventCompleteData;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: oou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class oou implements SurfaceTexture.OnFrameAvailableListener, oos {

    /* renamed from: n */
    private static final bnsn f38104n = odk.m28481a("CAR.WM.WIN");

    /* renamed from: A */
    private volatile boolean f38105A;

    /* renamed from: B */
    private volatile int f38106B;

    /* renamed from: C */
    private volatile ooy f38107C;

    /* renamed from: a */
    protected final oqa f38108a;

    /* renamed from: b */
    protected volatile oow f38109b;

    /* renamed from: c */
    protected volatile boolean f38110c = false;

    /* renamed from: d */
    protected int f38111d = 0;

    /* renamed from: e */
    protected FloatBuffer f38112e;

    /* renamed from: f */
    protected final float[] f38113f = new float[16];

    /* renamed from: g */
    public long f38114g = -1;

    /* renamed from: h */
    protected final int f38115h;

    /* renamed from: i */
    public final oor f38116i;

    /* renamed from: j */
    final oot f38117j;

    /* renamed from: k */
    protected volatile float f38118k;

    /* renamed from: l */
    protected volatile boolean f38119l;

    /* renamed from: m */
    protected final float[] f38120m = new float[16];

    /* renamed from: o */
    private final CarWindowManagerLayoutParams f38121o = new CarWindowManagerLayoutParams();

    /* renamed from: p */
    private Rect f38122p;

    /* renamed from: q */
    private Rect f38123q;

    /* renamed from: r */
    private Rect f38124r;

    /* renamed from: s */
    private volatile SurfaceTexture f38125s;

    /* renamed from: t */
    private volatile Surface f38126t;

    /* renamed from: u */
    private boolean f38127u;

    /* renamed from: v */
    private final AtomicInteger f38128v = new AtomicInteger(0);

    /* renamed from: w */
    private final AtomicInteger f38129w = new AtomicInteger(0);

    /* renamed from: x */
    private final Object f38130x = new Object();

    /* renamed from: y */
    private int f38131y;

    /* renamed from: z */
    private volatile boolean f38132z;

    public oou(oqa oqa, int i, oor oor, Surface surface) {
        this.f38108a = oqa;
        this.f38115h = i;
        this.f38116i = oor;
        this.f38117j = new oot(this);
        this.f38131y = 0;
        this.f38118k = 1.0f;
        if (surface != null) {
            this.f38126t = surface;
        }
    }

    @Deprecated
    /* renamed from: L */
    private final synchronized void m29404L() {
        oow oow = this.f38109b;
        this.f38109b = new oow(oow.f38138a, oow.f38139b, oow.f38140c, oow.f38141d, oow.f38144g - 1, oow.f38145h, oow.f38146i, oow.f38147j, oow.f38148k, oow.f38149l);
        mo22466K();
        this.f38108a.mo21695j(this);
    }

    /* renamed from: M */
    private final void m29405M() {
        if (this.f38126t != null) {
            this.f38126t.release();
            this.f38126t = null;
        }
        if (this.f38125s != null) {
            this.f38125s.release();
            this.f38125s = null;
        }
        int i = this.f38111d;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            GLES20.glFinish();
            this.f38111d = 0;
        }
    }

    /* renamed from: a */
    private final void m29406a(boolean z) {
        if (this.f38125s != null) {
            mo22429a();
        }
        this.f38110c = false;
        this.f38119l = false;
        this.f38128v.set(0);
        this.f38129w.set(0);
        if (z) {
            m29405M();
        }
    }

    /* renamed from: d */
    private final synchronized void m29407d(int i) {
        mo22466K();
        this.f38108a.mo21678c(this, i);
    }

    /* renamed from: A */
    public final boolean mo22405A() {
        int c = mo22436c();
        return c == 4 || c == 5;
    }

    /* renamed from: B */
    public final void mo22406B() {
        synchronized (this.f38130x) {
            this.f38131y = 2;
        }
        this.f38117j.mo22462a();
    }

    /* renamed from: C */
    public final void mo22407C() {
        oot oot = this.f38117j;
        oot.sendMessage(oot.obtainMessage(10));
    }

    /* renamed from: D */
    public final void mo22408D() {
        synchronized (this.f38130x) {
            if (this.f38131y < 4) {
                this.f38131y = 4;
                this.f38117j.mo22464b();
            }
        }
    }

    /* renamed from: E */
    public final Surface mo22409E() {
        return this.f38126t;
    }

    /* renamed from: F */
    public final void mo22410F() {
        synchronized (this.f38130x) {
            if (this.f38131y < 4) {
                this.f38131y = 4;
            }
        }
    }

    /* renamed from: G */
    public final void mo22411G() {
        synchronized (this.f38130x) {
            if (this.f38131y < 3) {
                this.f38131y = 3;
            }
        }
    }

    /* renamed from: H */
    public final boolean mo22412H() {
        return (this.f38109b == null || this.f38105A || (this.f38109b.f38149l & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) ? false : true;
    }

    /* renamed from: I */
    public final boolean mo22413I() {
        return this.f38109b == null || (this.f38109b.f38149l & 128) == 0;
    }

    /* renamed from: J */
    public final void mo22414J() {
        this.f38118k = 0.54f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo22466K() {
        float[] fArr = {(float) this.f38109b.f38138a, (float) this.f38109b.f38139b, (float) this.f38109b.f38144g, 0.0f, 0.0f, (float) this.f38109b.f38142e, (float) this.f38109b.f38139b, (float) this.f38109b.f38144g, 1.0f, 0.0f, (float) this.f38109b.f38138a, (float) this.f38109b.f38143f, (float) this.f38109b.f38144g, 0.0f, 1.0f, (float) this.f38109b.f38142e, (float) this.f38109b.f38143f, (float) this.f38109b.f38144g, 1.0f, 1.0f};
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f38112e = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
    }

    /* renamed from: a */
    public final synchronized void mo22421a(Rect rect) {
        this.f38124r = rect;
    }

    /* renamed from: b */
    public final String mo22432b() {
        return this.f38116i.mo21456a();
    }

    /* renamed from: c */
    public final int mo22436c() {
        int i;
        synchronized (this.f38130x) {
            i = this.f38131y;
        }
        return i;
    }

    /* renamed from: d */
    public final int mo22439d() {
        return this.f38115h;
    }

    /* renamed from: e */
    public final synchronized CarWindowManagerLayoutParams mo22440e() {
        return this.f38121o;
    }

    /* renamed from: f */
    public final void mo22441f() {
        this.f38110c = true;
    }

    /* renamed from: g */
    public final void mo22442g() {
        this.f38110c = false;
    }

    /* renamed from: h */
    public final boolean mo22443h() {
        return this.f38110c;
    }

    /* renamed from: i */
    public final int mo22444i() {
        return this.f38109b.f38144g;
    }

    /* renamed from: j */
    public final int mo22445j() {
        return this.f38106B;
    }

    /* renamed from: k */
    public final int mo22446k() {
        return this.f38109b.f38145h;
    }

    /* renamed from: l */
    public final Animation mo22447l() {
        return this.f38109b.f38147j;
    }

    /* renamed from: m */
    public final Animation mo22448m() {
        return this.f38109b.f38148k;
    }

    /* renamed from: n */
    public final Rect mo22449n() {
        return this.f38122p;
    }

    /* renamed from: o */
    public final Rect mo22450o() {
        return this.f38123q;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z;
        boolean z2;
        synchronized (this.f38130x) {
            int i = this.f38131y;
            z = true;
            z2 = false;
            if (i == 2) {
                if (this.f38110c) {
                    z = false;
                    z2 = true;
                }
            } else if (i != 1) {
            }
            z = false;
        }
        if (z) {
            return;
        }
        if (!z2) {
            this.f38108a.mo21661a(this);
        } else {
            this.f38108a.mo21647C();
        }
    }

    /* renamed from: p */
    public final synchronized Rect mo22451p() {
        return this.f38124r;
    }

    /* renamed from: q */
    public final oow mo22452q() {
        return this.f38109b;
    }

    /* renamed from: r */
    public final synchronized void mo22453r() {
        int c = mo22436c();
        if (c != 0) {
            if (c != 5) {
                bnsi d = f38104n.mo68390d();
                d.mo68432a("oou", "r", 415, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68420a("window init called while not cleaned up %s", this);
                m29406a(true);
            }
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f38111d = i;
        GLES20.glBindTexture(36197, i);
        opv.m29540a(f38104n, "glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, (float) this.f38108a.mo21645A());
        GLES20.glTexParameterf(36197, 10240, (float) this.f38108a.mo21645A());
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        opv.m29540a(f38104n, "glTexParameter");
        this.f38125s = new SurfaceTexture(this.f38111d);
        this.f38125s.setDefaultBufferSize(this.f38109b.f38140c, this.f38109b.f38141d);
        this.f38126t = new Surface(this.f38125s);
        this.f38125s.setOnFrameAvailableListener(this);
        mo22429a();
        this.f38128v.set(0);
        this.f38129w.set(0);
        synchronized (this.f38130x) {
            this.f38131y = 1;
        }
        GLES20.glBindTexture(36197, 0);
        oot oot = this.f38117j;
        oot.sendMessage(oot.obtainMessage(1, this.f38109b.f38140c, this.f38109b.f38141d));
    }

    /* renamed from: s */
    public final void mo22454s() {
        synchronized (this.f38130x) {
            this.f38131y = 5;
        }
        oot oot = this.f38117j;
        oot.sendMessage(oot.obtainMessage(11));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        if (r2 != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r6.f38117j.mo22464b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        m29406a(false);
        r6.f38116i.mo21463b(r6);
        r0 = r6.f38130x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r6.f38131y = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        return;
     */
    /* renamed from: t */
    public final synchronized void mo22455t() {
        boolean z;
        synchronized (this.f38130x) {
            int i = this.f38131y;
            if (i == 5) {
                bnsi d = f38104n.mo68390d();
                d.mo68432a("oou", "t", 467, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68420a("requesting removal for already removed window %s", this);
            } else if (i < 4) {
                this.f38131y = 4;
                z = true;
            } else {
                z = false;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String name = getClass().getName();
        sb.append(name.substring(name.lastIndexOf(46) + 1));
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append("{l=");
        sb.append(this.f38115h);
        sb.append(",s=");
        sb.append(this.f38131y);
        sb.append(",vis=");
        sb.append(this.f38110c);
        sb.append(",anim=");
        sb.append(this.f38119l);
        sb.append(",a=");
        sb.append(this.f38118k);
        oow oow = this.f38109b;
        if (oow != null) {
            sb.append(oow.toString());
        }
        sb.append(",listener=");
        sb.append(this.f38116i.mo21456a());
        sb.append(",nupdated=");
        sb.append(this.f38128v.get());
        sb.append(",nrendered=");
        sb.append(this.f38129w.get());
        sb.append(",tid=");
        sb.append(this.f38111d);
        SurfaceTexture surfaceTexture = this.f38125s;
        if (surfaceTexture != null) {
            sb.append(", timestamp=");
            sb.append(surfaceTexture.getTimestamp());
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean mo22456u() {
        int c = mo22436c();
        return (c == 1 || c == 2 || c == 3) ? false : true;
    }

    /* renamed from: v */
    public final void mo22457v() {
        this.f38132z = true;
    }

    /* renamed from: w */
    public final synchronized DrawingSpec mo22458w() {
        DrawingSpec drawingSpec;
        if (this.f38126t != null) {
            this.f38127u = true;
            int i = this.f38109b.f38140c;
            int i2 = this.f38109b.f38141d;
            int r = this.f38108a.mo21705r();
            Surface surface = this.f38126t;
            bmxy.m108581a(surface);
            drawingSpec = new DrawingSpec(i, i2, r, surface, this.f38109b.f38146i);
        } else {
            drawingSpec = null;
        }
        return drawingSpec;
    }

    /* renamed from: x */
    public final synchronized void mo22459x() {
        this.f38127u = false;
        notify();
    }

    /* renamed from: y */
    public final synchronized void mo22460y() {
        if (this.f38108a.mo21683d()) {
            if (this.f38106B != this.f38109b.f38144g) {
                m29407d(this.f38106B);
            }
        }
        this.f38119l = false;
        this.f38107C = null;
    }

    /* renamed from: z */
    public final boolean mo22461z() {
        return this.f38119l;
    }

    /* renamed from: b */
    public final synchronized void mo22433b(int i) {
        oow oow = this.f38109b;
        this.f38109b = new oow(oow.f38138a, oow.f38139b, oow.f38140c, oow.f38141d, i, oow.f38145h, oow.f38146i, oow.f38147j, oow.f38148k, oow.f38149l);
    }

    /* renamed from: c */
    public final void mo22437c(KeyEvent keyEvent) {
        this.f38108a.mo21674b(this, keyEvent);
    }

    /* renamed from: b */
    public final void mo22434b(KeyEvent keyEvent) {
        this.f38108a.mo21669a(this, keyEvent);
    }

    /* renamed from: c */
    public final boolean mo22438c(int i) {
        return (i & this.f38109b.f38149l) != 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.opengl.GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer):void}
     arg types: [int, int, int, int, int, java.nio.FloatBuffer]
     candidates:
      ClspMth{android.opengl.GLES20.glVertexAttribPointer(int, int, int, boolean, int, int):void}
      ClspMth{android.opengl.GLES20.glVertexAttribPointer(int, int, int, boolean, int, java.nio.Buffer):void} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo22467a(float f, float[] fArr) {
        boolean z;
        opw opw;
        int i;
        if (f != 1.0f || this.f38132z) {
            z = true;
        } else {
            z = false;
        }
        if (f != 1.0f) {
            this.f38108a.mo21680d(1);
            opw = this.f38108a.mo21676c(1);
            GLES20.glUniform1f(GLES20.glGetUniformLocation(opw.f38213a, "uAlphaMask"), f);
        } else {
            this.f38108a.mo21680d(0);
            opw = this.f38108a.mo21676c(0);
        }
        if (z) {
            GLES20.glEnable(3042);
            if (!cctl.m131525c()) {
                i = 770;
            } else {
                i = 1;
            }
            GLES20.glBlendFunc(i, 771);
        } else {
            GLES20.glDisable(3042);
        }
        GLES20.glUniformMatrix4fv(opw.f38214b, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f38111d);
        this.f38112e.position(0);
        GLES20.glVertexAttribPointer(opw.f38216d, 3, 5126, false, 20, (Buffer) this.f38112e);
        GLES20.glEnableVertexAttribArray(opw.f38216d);
        this.f38112e.position(3);
        GLES20.glVertexAttribPointer(opw.f38217e, 2, 5126, false, 20, (Buffer) this.f38112e);
        GLES20.glEnableVertexAttribArray(opw.f38217e);
        GLES20.glUniformMatrix4fv(opw.f38215c, 1, false, this.f38113f, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* renamed from: b */
    public final void mo22435b(MotionEvent motionEvent) {
        this.f38117j.mo22463a(motionEvent);
    }

    /* renamed from: a */
    public final void mo22415a(int i) {
        oot oot = this.f38117j;
        oot.sendMessage(oot.obtainMessage(9, i, 0));
    }

    /* renamed from: a */
    public final synchronized void mo22416a(int i, int i2, int i3, int i4, int i5, int i6, Rect rect, Animation animation, Animation animation2, int i7) {
        synchronized (this) {
            this.f38109b = new oow(i, i2, i3, i4, i5, i6, rect, animation, animation2, i7);
            this.f38106B = this.f38109b.f38144g;
            ooq o = this.f38108a.mo21702o();
            bmxy.m108581a(o);
            this.f38122p = new Rect(this.f38109b.f38138a, o.f38097g - this.f38109b.f38143f, this.f38109b.f38142e, o.f38097g - this.f38109b.f38139b);
            this.f38123q = rect;
            mo22466K();
        }
    }

    /* renamed from: a */
    public final synchronized void mo22417a(int i, int i2, int i3, int i4, int i5, int i6, Animation animation, Animation animation2, int i7) {
        synchronized (this) {
            mo22416a(i, i2, i3, i4, i5, i6, null, animation, animation2, i7);
            if (this.f38125s != null) {
                this.f38125s.setDefaultBufferSize(this.f38109b.f38140c, this.f38109b.f38141d);
            }
            synchronized (this.f38130x) {
                if (this.f38131y == 2) {
                    this.f38117j.mo22462a();
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo22418a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime + j;
        while (true) {
            if (!this.f38127u) {
                break;
            } else if (elapsedRealtime >= j2) {
                bnsi c = f38104n.mo68388c();
                c.mo68432a("oou", "a", 502, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68420a("Tearing down window that's still in use: %s", this);
                break;
            } else {
                try {
                    wait(j);
                } catch (InterruptedException e) {
                }
                elapsedRealtime = SystemClock.elapsedRealtime();
            }
        }
        m29405M();
    }

    /* renamed from: a */
    public final void mo22419a(long j, long j2, int i, List list) {
        if (this.f38110c) {
            int n = this.f38108a.mo21701n();
            this.f38117j.mo22463a(oeq.m28606a(j, j2, i, list, -this.f38109b.f38138a, (-n) + this.f38109b.f38143f, 4098, 1));
        }
    }

    /* renamed from: a */
    public final void mo22420a(long j, List list) {
        mo22419a(j, j, 4, list);
        this.f38105A = true;
    }

    /* renamed from: a */
    public final void mo22422a(KeyEvent keyEvent) {
        oot oot = this.f38117j;
        oot.sendMessage(oot.obtainMessage(8, keyEvent));
    }

    /* renamed from: a */
    public final void mo22423a(MotionEvent motionEvent) {
        this.f38117j.mo22463a(motionEvent);
    }

    /* renamed from: a */
    public final void mo22424a(MotionEvent motionEvent, TouchEventCompleteData touchEventCompleteData) {
        this.f38108a.mo21663a(this, motionEvent, touchEventCompleteData);
    }

    /* renamed from: a */
    public final synchronized void mo22425a(CarWindowManagerLayoutParams carWindowManagerLayoutParams) {
        int i = carWindowManagerLayoutParams.f29396a;
        oot oot = this.f38117j;
        oot.sendMessage(oot.obtainMessage(12));
    }

    /* renamed from: a */
    public final void mo22426a(InputFocusChangedEvent inputFocusChangedEvent) {
        oot oot = this.f38117j;
        oot.sendMessage(oot.obtainMessage(6, inputFocusChangedEvent));
    }

    /* renamed from: a */
    public final void mo22427a(PrintWriter printWriter) {
        printWriter.println(toString());
    }

    /* renamed from: a */
    public final synchronized void mo22428a(ooy ooy, boolean z) {
        if (this.f38108a.mo21683d()) {
            int a = ooy.mo22471a();
            if (a == -1) {
                m29407d(this.f38109b.f38144g - 1);
            } else if (a == 1) {
                m29407d(this.f38109b.f38144g + 1);
            }
        } else if (z && (this.f38115h != 4 || cctl.f179894a.mo6606a().mo76758c())) {
            m29404L();
        }
        this.f38107C = ooy;
        this.f38119l = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r6.f38125s.updateTexImage();
        r6.f38125s.getTransformMatrix(r6.f38113f);
        r2 = r6.f38125s.getTimestamp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        if (r2 == r6.f38114g) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        r6.f38114g = r2;
        r6.f38128v.getAndIncrement();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo22429a() {
        if (this.f38125s != null) {
            synchronized (this.f38130x) {
                if (this.f38131y < 3) {
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo22430a(int i, int i2) {
        int n = this.f38108a.mo21701n() - i2;
        return i >= this.f38109b.f38138a && n >= this.f38109b.f38139b && i < this.f38109b.f38138a + this.f38109b.f38140c && n < this.f38109b.f38139b + this.f38109b.f38141d;
    }

    /* renamed from: a */
    public final synchronized boolean mo22431a(float[] fArr) {
        boolean z = false;
        if (!this.f38110c) {
            if (!this.f38119l) {
                return false;
            }
        }
        if (this.f38128v.get() <= 0) {
            return false;
        }
        float f = this.f38118k;
        if (this.f38119l) {
            if (this.f38128v.get() > 0) {
                z = true;
            }
            bmxy.m108581a(this.f38107C);
            opa a = this.f38107C.mo22473a(z);
            Matrix.multiplyMM(this.f38120m, 0, fArr, 0, a.f38162a, 0);
            fArr = this.f38120m;
            float f2 = a.f38163b;
            if (f2 != 1.0f) {
                f = f2;
            }
        } else if (this.f38118k == 0.0f) {
            return false;
        }
        this.f38129w.incrementAndGet();
        mo22467a(f, fArr);
        return true;
    }
}

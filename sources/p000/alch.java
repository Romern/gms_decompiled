package p000;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;

/* renamed from: alch */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alch extends GLSurfaceView {

    /* renamed from: a */
    public boolean f73404a = true;

    /* renamed from: b */
    public alcj f73405b;

    /* renamed from: c */
    public final alcl f73406c = new alcl();

    /* renamed from: d */
    public final PointF f73407d = new PointF();

    /* renamed from: e */
    public albu f73408e;

    /* renamed from: f */
    public final alay f73409f = new alay();

    /* renamed from: g */
    public final alay f73410g = new alay();

    /* renamed from: h */
    private boolean f73411h;

    /* renamed from: i */
    private float f73412i;

    /* renamed from: j */
    private float f73413j;

    /* renamed from: k */
    private boolean f73414k;

    /* renamed from: l */
    private PointF f73415l;

    /* renamed from: m */
    private long f73416m;

    /* renamed from: n */
    private boolean f73417n = false;

    /* renamed from: o */
    private final alay f73418o = new alay();

    /* renamed from: p */
    private final alay f73419p = new alay();

    /* renamed from: b */
    private static final float m60842b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() <= 1) {
            return 0.0f;
        }
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    /* renamed from: a */
    public final void mo40113a(boolean z) {
        alcj alcj = this.f73405b;
        alcj.f73454o = z;
        if (!z) {
            alcj.mo40119a((float) (alcj.f73443d / 2), (float) (alcj.f73444e / 2), alcj.f73452m);
            alay alay = alcj.f73452m;
            alcj.f73448i = -alay.f73237a;
            alcj.f73447h = 180.0f - alay.f73238b;
            alcj.mo40122c();
        }
    }

    /* renamed from: a */
    public final boolean mo40114a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            albu albu = this.f73408e;
            if (albu != null) {
                ((alas) albu).f73232a.f81435b.mo40110a();
            }
            this.f73406c.mo40126a();
            this.f73415l = new PointF(motionEvent.getX(), motionEvent.getY());
            this.f73405b.mo40119a(motionEvent.getX(), motionEvent.getY(), this.f73418o);
            this.f73416m = motionEvent.getEventTime();
            alcl alcl = this.f73406c;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            alcl.f73468a = motionEvent.getEventTime();
            alcl.f73469b = new PointF(x, y);
            return true;
        } else if (action == 1) {
            double hypot = Math.hypot((double) (this.f73415l.x - motionEvent.getX()), (double) (this.f73415l.y - motionEvent.getY()));
            if (motionEvent.getEventTime() - this.f73416m < 400 && hypot < 10.0d && this.f73404a) {
                alcj alcj = this.f73405b;
                alcj.f73442c = !alcj.f73442c;
                alcj.mo40121b();
            }
            this.f73414k = false;
            if (this.f73417n) {
                this.f73417n = false;
            } else if (hypot > 10.0d) {
                this.f73405b.mo40119a(motionEvent.getX(), motionEvent.getY(), this.f73409f);
                alcl alcl2 = this.f73406c;
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (motionEvent.getEventTime() - alcl2.f73468a >= 200) {
                    alcl2.f73468a = 0;
                    alcl2.f73469b = new PointF(0.0f, 0.0f);
                    alcl2.f73470c = new PointF(0.0f, 0.0f);
                } else if (alcl2.mo40128b(new PointF(x2, y2))) {
                    requestRender();
                }
            }
            return true;
        } else if (action == 2) {
            if (motionEvent.getPointerCount() == 1) {
                alcl alcl3 = this.f73406c;
                float x3 = motionEvent.getX();
                float y3 = motionEvent.getY();
                long eventTime = motionEvent.getEventTime();
                long j = eventTime - alcl3.f73468a;
                if (j >= 50) {
                    float f = 1000.0f / ((float) j);
                    alcl3.f73470c.x = (x3 - alcl3.f73469b.x) * f;
                    alcl3.f73470c.y = (y3 - alcl3.f73469b.y) * f;
                    alcl3.f73468a = eventTime;
                    alcl3.f73469b.x = x3;
                    alcl3.f73469b.y = y3;
                }
            }
            if (this.f73414k) {
                this.f73405b.mo40119a(motionEvent.getX(), motionEvent.getY(), this.f73418o);
                this.f73414k = false;
            }
            if (this.f73411h && motionEvent.getPointerCount() > 1) {
                float b = m60842b(motionEvent);
                this.f73413j = b;
                float f2 = this.f73412i;
                alcj alcj2 = this.f73405b;
                alcj2.mo40117a(alcj2.f73445f / (b / f2));
                requestRender();
            } else {
                this.f73405b.mo40119a(motionEvent.getX(), motionEvent.getY(), this.f73419p);
                alay alay = this.f73418o;
                float f3 = alay.f73237a;
                alay alay2 = this.f73419p;
                float f4 = f3 - alay2.f73237a;
                float f5 = alay.f73238b - alay2.f73238b;
                PointF pointF = this.f73415l;
                if (Math.hypot((double) (pointF.x - motionEvent.getX()), (double) (pointF.y - motionEvent.getY())) >= 4.0d) {
                    alcj alcj3 = this.f73405b;
                    alcj3.mo40118a(alcj3.f73448i - f4, alcj3.f73447h - f5);
                    requestRender();
                }
            }
            return true;
        } else if (action == 5) {
            this.f73412i = m60842b(motionEvent);
            this.f73411h = true;
            return true;
        } else if (action != 6) {
            return false;
        } else {
            this.f73411h = false;
            float f6 = this.f73413j;
            float f7 = this.f73412i;
            alcj alcj4 = this.f73405b;
            alcj4.mo40117a(alcj4.f73445f / (f6 / f7));
            alcj4.f73445f = alcj4.f73446g;
            this.f73414k = true;
            this.f73417n = true;
            return true;
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo40114a(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public alch(Context context, alce alce) {
        super(context);
        try {
            alcj alcj = new alcj(this, alce, context);
            this.f73405b = alcj;
            alcf alcf = new alcf(this);
            alcj.f73457r = alcf;
            if (alcj.f73441b) {
                alcf.mo40055a();
            }
            setEGLContextClientVersion(2);
            setRenderer(this.f73405b);
            setRenderMode(0);
        } catch (Exception e) {
            bqye.m113758a(e);
        }
    }
}

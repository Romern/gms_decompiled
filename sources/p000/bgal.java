package p000;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: bgal */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgal extends adzt {

    /* renamed from: b */
    public static final Object f115881b = new Object();

    /* renamed from: a */
    public boolean f115882a = false;

    /* renamed from: c */
    public final bgah f115883c = new bgah();

    /* renamed from: d */
    public bgak[] f115884d;

    /* renamed from: e */
    public int f115885e = -1;

    /* renamed from: f */
    public bgak[] f115886f;

    /* renamed from: h */
    public int f115887h;

    /* renamed from: i */
    public bgan f115888i;

    /* renamed from: j */
    public final HashMap f115889j = new HashMap();

    /* renamed from: k */
    public bgaf f115890k;

    /* renamed from: l */
    public bgaf f115891l;

    /* renamed from: m */
    public final ArrayList f115892m = new ArrayList();

    /* renamed from: n */
    private boolean f115893n = false;

    /* renamed from: o */
    private Message f115894o;

    /* renamed from: p */
    private boolean f115895p;

    /* renamed from: q */
    private final bgai f115896q = new bgai();

    /* renamed from: r */
    private final bgaj f115897r = new bgaj();

    public bgal(Looper looper, bgan bgan) {
        super(looper);
        this.f115888i = bgan;
        mo62539a(this.f115896q);
        mo62539a(this.f115897r);
    }

    /* renamed from: a */
    private final void m98396a(int i) {
        while (i <= this.f115885e) {
            this.f115884d[i].f115878a.mo62503k();
            this.f115884d[i].f115880c = true;
            i++;
        }
    }

    public final void handleMessage(Message message) {
        bgaf bgaf;
        bgak bgak;
        if (!this.f115893n) {
            bgan bgan = this.f115888i;
            if (message.what != -3) {
                if (message.what == -4) {
                    Message message2 = (Message) message.obj;
                    handleMessage(message2);
                    if (bgan != null) {
                        synchronized (bgan.f115903I) {
                            int i = bgan.f115902H - 1;
                            bgan.f115902H = i;
                            if (i == 0) {
                                this.f115888i.mo62544b(bgan.f115904J);
                                if (bgan.mo62548b()) {
                                    this.f115888i.f115901G.mo49120c();
                                }
                            }
                        }
                    }
                    message2.recycle();
                    return;
                }
                this.f115894o = message;
                if (this.f115895p) {
                    bgak bgak2 = this.f115884d[this.f115885e];
                    if (message.what == -1 && message.obj == f115881b) {
                        this.f115891l = this.f115897r;
                    } else if (!bgak2.f115878a.mo62484a(message)) {
                        bgak bgak3 = bgak2.f115879b;
                        boolean z = this.f115888i.f115905K.f115882a;
                        bgak2 = null;
                    }
                    if (bgak2 != null) {
                        bgaf = bgak2.f115878a;
                    } else {
                        bgaf = null;
                    }
                } else if (message.what == -2 && this.f115894o.obj == f115881b) {
                    this.f115895p = true;
                    m98396a(0);
                    bgaf = null;
                } else {
                    String valueOf = String.valueOf(message);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
                    sb.append("StateMachine.handleMessage: The start method not called, received msg: ");
                    sb.append(valueOf);
                    throw new RuntimeException(sb.toString());
                }
                bgaf bgaf2 = this.f115884d[this.f115885e].f115878a;
                if (message.obj != f115881b) {
                    this.f115883c.mo62533a(this.f115888i, this.f115894o, "", bgaf, bgaf2, this.f115891l);
                }
                bgaf bgaf3 = this.f115891l;
                if (bgaf3 != null) {
                    while (true) {
                        this.f115887h = 0;
                        bgak bgak4 = (bgak) this.f115889j.get(bgaf3);
                        bgak[] bgakArr = this.f115886f;
                        int i2 = this.f115887h;
                        this.f115887h = i2 + 1;
                        bgakArr[i2] = bgak4;
                        bgak bgak5 = bgak4.f115879b;
                        while (true) {
                            int i3 = this.f115885e;
                            if (i3 >= 0 && (bgak = this.f115884d[i3]) != null) {
                                bgak.f115878a.mo62504l();
                                bgak[] bgakArr2 = this.f115884d;
                                int i4 = this.f115885e;
                                bgakArr2[i4].f115880c = false;
                                this.f115885e = i4 - 1;
                            }
                        }
                        m98396a(mo62538a());
                        for (int size = this.f115892m.size() - 1; size >= 0; size--) {
                            this.f115888i.mo62551c((Message) this.f115892m.get(size));
                        }
                        this.f115892m.clear();
                        bgaf bgaf4 = this.f115891l;
                        if (bgaf3 == bgaf4) {
                            break;
                        }
                        bgaf3 = bgaf4;
                    }
                    this.f115891l = null;
                }
                if (bgaf3 != null && bgaf3 == this.f115897r) {
                    this.f115888i.mo62507a();
                    if (this.f115888i.f115906L != null) {
                        getLooper().quit();
                        this.f115888i.f115906L = null;
                    }
                    if (this.f115888i.mo62548b()) {
                        this.f115888i.f115901G.mo49120c();
                    }
                    this.f115888i.mo62544b(Integer.MAX_VALUE);
                    this.f115888i.f115905K = null;
                    this.f115888i = null;
                    this.f115894o = null;
                    this.f115883c.mo62535c();
                    this.f115884d = null;
                    this.f115886f = null;
                    this.f115889j.clear();
                    this.f115890k = null;
                    this.f115891l = null;
                    this.f115892m.clear();
                    this.f115893n = true;
                }
            } else if (bgan != null) {
                bgan.f115904J++;
            }
        }
    }

    /* renamed from: a */
    public final int mo62538a() {
        int i = this.f115885e + 1;
        int i2 = i;
        for (int i3 = this.f115887h - 1; i3 >= 0; i3--) {
            this.f115884d[i2] = this.f115886f[i3];
            i2++;
        }
        this.f115885e = i2 - 1;
        return i;
    }

    /* renamed from: a */
    public final void mo62539a(bgaf bgaf) {
        bgak bgak = (bgak) this.f115889j.get(bgaf);
        if (bgak == null) {
            bgak = new bgak();
            this.f115889j.put(bgaf, bgak);
        }
        bgak.f115878a = bgaf;
        bgak.f115879b = null;
        bgak.f115880c = false;
    }
}

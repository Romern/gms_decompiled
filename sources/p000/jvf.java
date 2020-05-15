package p000;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.chimera.Loader;

/* renamed from: jvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jvf extends Loader implements jvg {

    /* renamed from: a */
    public static final sek f23330a = ght.m13171a("AddAccountLoader");

    /* renamed from: b */
    jvh f23331b = null;

    /* renamed from: c */
    public final Context f23332c;

    /* renamed from: d */
    AsyncTask f23333d;

    /* renamed from: e */
    AsyncTask f23334e;

    /* renamed from: f */
    private boolean f23335f = false;

    /* renamed from: g */
    private final ixl f23336g;

    /* renamed from: h */
    private final String f23337h;

    /* renamed from: i */
    private final String f23338i;

    /* renamed from: j */
    private final String f23339j;

    /* renamed from: k */
    private final String f23340k;

    /* renamed from: l */
    private final boolean f23341l;

    /* renamed from: m */
    private final boolean f23342m;

    /* renamed from: n */
    private final boolean f23343n;

    public jvf(Context context, ixl ixl, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        super(context);
        this.f23332c = context;
        this.f23336g = ixl;
        this.f23337h = str;
        this.f23338i = str2;
        this.f23339j = str3;
        this.f23340k = str4;
        this.f23341l = z;
        this.f23342m = z2;
        this.f23343n = z3;
    }

    /* renamed from: c */
    private final void m17394c() {
        AsyncTask asyncTask = this.f23333d;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f23333d = null;
        }
    }

    /* renamed from: a */
    public final void mo14146a() {
        mo14148b();
        Context context = this.f23332c;
        ilq ilq = new ilq(context);
        ixl ixl = this.f23336g;
        String str = this.f23337h;
        String str2 = this.f23338i;
        String str3 = this.f23340k;
        boolean z = this.f23341l;
        boolean z2 = this.f23342m;
        boolean z3 = this.f23343n;
        new jfn();
        this.f23334e = new jvi(context, ilq, this, ixl, str, str2, str3, z, z2, z3).execute(new Void[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14148b() {
        AsyncTask asyncTask = this.f23334e;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.f23334e = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        mo14148b();
        m17394c();
        this.f23331b = null;
        super.onReset();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        jvh jvh = this.f23331b;
        if (jvh != null) {
            deliverResult(jvh);
        }
        if (!this.f23335f) {
            this.f23335f = true;
            m17394c();
            this.f23333d = new jvx(this, new jds(getContext()), this.f23336g, this.f23339j).execute(new Void[0]);
        }
    }

    /* renamed from: a */
    public final void deliverResult(jvh jvh) {
        this.f23331b = jvh;
        sek sek = f23330a;
        String valueOf = String.valueOf(jvh.toString());
        sek.mo25414c(valueOf.length() == 0 ? new String("Got result: ") : "Got result: ".concat(valueOf), new Object[0]);
        super.deliverResult(jvh);
    }
}

package p000;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ayck */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayck extends adzt {

    /* renamed from: f */
    public static final Object f97128f = new Object();

    /* renamed from: a */
    public aycl f97129a;

    /* renamed from: b */
    public final Map f97130b = new HashMap();

    /* renamed from: c */
    public aycg f97131c;

    /* renamed from: d */
    public aycg f97132d;

    /* renamed from: e */
    public final ayci f97133e = new ayci();

    /* renamed from: h */
    private aycg f97134h;

    /* renamed from: i */
    private boolean f97135i = false;

    /* renamed from: j */
    private boolean f97136j = false;

    /* renamed from: k */
    private boolean f97137k = false;

    /* renamed from: l */
    private Message f97138l;

    /* renamed from: m */
    private final aycg f97139m;

    public ayck(Looper looper, aycl aycl) {
        super(looper);
        aycj aycj = new aycj();
        this.f97139m = aycj;
        this.f97129a = aycl;
        mo53888a(aycj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo53888a(aycg aycg) {
        if (!this.f97130b.containsKey(aycg)) {
            this.f97130b.put(aycg, new ArrayList());
            return;
        }
        String str = this.f97129a.f97140A;
        String valueOf = String.valueOf(aycg);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("Trying to add state that has already been added: ");
        sb.append(valueOf);
        Log.w(str, sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo53889b(aycg aycg) {
        if (this.f97135i) {
            String str = this.f97129a.f97140A;
            String valueOf = String.valueOf(this.f97134h);
            String valueOf2 = String.valueOf(aycg);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81 + String.valueOf(valueOf2).length());
            sb.append("transitionTo called while transition already in progress to: ");
            sb.append(valueOf);
            sb.append(", new target state: ");
            sb.append(valueOf2);
            Log.w(str, sb.toString());
        }
        this.f97134h = aycg;
    }

    public final void handleMessage(Message message) {
        String str;
        if (this.f97136j) {
            String str2 = this.f97129a.f97140A;
            int i = message.what;
            StringBuilder sb = new StringBuilder(83);
            sb.append("Received message but state machine has already quit. Ignoring msg.what: ");
            sb.append(i);
            Log.w(str2, sb.toString());
            return;
        }
        if (this.f97129a.mo53869b(message)) {
            aycl aycl = this.f97129a;
            aycg aycg = this.f97132d;
            if (aycg != null) {
                str = aycg.mo53863c();
            } else {
                str = "";
            }
            int i2 = message.what;
            String a = this.f97129a.mo53864a(message.what);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(a).length());
            sb2.append("[");
            sb2.append(str);
            sb2.append("] handleMessage: msg.what=");
            sb2.append(i2);
            sb2.append("(");
            sb2.append(a);
            sb2.append(")");
            aycl.mo53897b(sb2.toString());
        }
        this.f97138l = message;
        if (!this.f97137k) {
            if (message.what == -2 && message.obj == f97128f) {
                this.f97137k = true;
                aycg aycg2 = this.f97131c;
                this.f97132d = aycg2;
                aycg2.mo53860a();
            } else {
                int i3 = message.what;
                StringBuilder sb3 = new StringBuilder(83);
                sb3.append("StateMachine.handleMessage: Start method not called, received msg.what: ");
                sb3.append(i3);
                throw new RuntimeException(sb3.toString());
            }
        } else if (message.what == -1 && message.obj == f97128f) {
            mo53889b(this.f97139m);
        } else if (!this.f97132d.mo53861a(message)) {
            aycl aycl2 = this.f97129a;
            int i4 = message.what;
            StringBuilder sb4 = new StringBuilder(38);
            sb4.append("unhandledMessage: msg.what=");
            sb4.append(i4);
            aycl2.mo53897b(sb4.toString());
        }
        if (this.f97138l.obj != f97128f) {
            this.f97133e.mo53885a(this.f97129a, this.f97138l, "", this.f97132d, this.f97134h);
        }
        if (this.f97134h == null) {
            return;
        }
        if (!((List) this.f97130b.get(this.f97132d)).contains(this.f97134h) && this.f97134h != this.f97139m) {
            String str3 = this.f97129a.f97140A;
            String c = this.f97132d.mo53863c();
            String c2 = this.f97134h.mo53863c();
            StringBuilder sb5 = new StringBuilder(String.valueOf(c).length() + 49 + String.valueOf(c2).length());
            sb5.append("Trying to perform an invalid transition from ");
            sb5.append(c);
            sb5.append(" to ");
            sb5.append(c2);
            Log.w(str3, sb5.toString());
            return;
        }
        this.f97135i = true;
        this.f97132d.mo53862b();
        aycg aycg3 = this.f97134h;
        this.f97132d = aycg3;
        this.f97134h = null;
        this.f97135i = false;
        aycg3.mo53860a();
        if (this.f97132d == this.f97139m) {
            this.f97129a.mo53868b();
            aycl aycl3 = this.f97129a;
            HandlerThread handlerThread = aycl3.f97142C;
            aycl3.f97141B = null;
            this.f97129a = null;
            this.f97138l = null;
            this.f97133e.mo53886b();
            this.f97132d = null;
            this.f97134h = null;
            this.f97131c = null;
            this.f97136j = true;
        }
    }
}

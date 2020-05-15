package p000;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: sae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class sae extends adzt {

    /* renamed from: a */
    final /* synthetic */ sam f43916a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sae(sam sam, Looper looper) {
        super(looper);
        this.f43916a = sam;
    }

    /* renamed from: b */
    private static final void m34739b(Message message) {
        saf saf = (saf) message.obj;
        saf.mo25282b();
        saf.mo25284c();
    }

    /* renamed from: c */
    private static final boolean m34740c(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    public final void handleMessage(Message message) {
        Object obj;
        if (this.f43916a.f43935F.get() != message.arg1) {
            if (m34740c(message)) {
                m34739b(message);
            }
        } else if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.f43916a.mo25302q()) {
            m34739b(message);
        } else {
            PendingIntent pendingIntent = null;
            if (message.what == 4) {
                sam sam = this.f43916a;
                ConnectionResult connectionResult = new ConnectionResult(message.arg2);
                String[] strArr = sam.f43928G;
                sam.f43932C = connectionResult;
                sam sam2 = this.f43916a;
                if (!sam2.f43933D && !TextUtils.isEmpty(sam2.mo6464b()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(sam2.mo6464b());
                        sam sam3 = this.f43916a;
                        if (!sam3.f43933D) {
                            sam3.m34754a(3, (IInterface) null);
                            return;
                        }
                    } catch (ClassNotFoundException e) {
                    }
                }
                ConnectionResult connectionResult2 = this.f43916a.f43932C;
                if (connectionResult2 == null) {
                    connectionResult2 = new ConnectionResult(8);
                }
                this.f43916a.f43954x.mo24901a(connectionResult2);
                this.f43916a.mo16782a(connectionResult2);
            } else if (message.what == 5) {
                sam sam4 = this.f43916a;
                String[] strArr2 = sam.f43928G;
                ConnectionResult connectionResult3 = sam4.f43932C;
                if (connectionResult3 == null) {
                    connectionResult3 = new ConnectionResult(8);
                }
                this.f43916a.f43954x.mo24901a(connectionResult3);
                this.f43916a.mo16782a(connectionResult3);
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                ConnectionResult connectionResult4 = new ConnectionResult(message.arg2, pendingIntent);
                this.f43916a.f43954x.mo24901a(connectionResult4);
                this.f43916a.mo16782a(connectionResult4);
            } else if (message.what == 6) {
                this.f43916a.m34754a(5, (IInterface) null);
                sac sac = this.f43916a.f43930A;
                if (sac != null) {
                    sac.mo6635a(message.arg2);
                }
                this.f43916a.mo25292a(message.arg2);
                this.f43916a.mo25299a(5, 1, (IInterface) null);
            } else if (message.what == 2 && !this.f43916a.mo25301p()) {
                m34739b(message);
            } else if (m34740c(message)) {
                saf saf = (saf) message.obj;
                synchronized (saf) {
                    obj = saf.f43917d;
                    if (saf.f43918e) {
                        String valueOf = String.valueOf(saf);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        sb.append("Callback proxy ");
                        sb.append(valueOf);
                        sb.append(" being reused. This is not safe.");
                        Log.w("GmsClient", sb.toString());
                    }
                }
                if (obj == null) {
                    saf.mo25282b();
                } else {
                    try {
                        saf.mo25280a(obj);
                    } catch (RuntimeException e2) {
                        saf.mo25282b();
                        throw e2;
                    }
                }
                synchronized (saf) {
                    saf.f43918e = true;
                }
                saf.mo25284c();
            } else {
                int i = message.what;
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i);
                Log.wtf("GmsClient", sb2.toString(), new Exception());
            }
        }
    }
}

package p000;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: bhcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhcf extends adzt {

    /* renamed from: a */
    final /* synthetic */ bhcg f118290a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bhcf(bhcg bhcg, Looper looper) {
        super(looper);
        this.f118290a = bhcg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6820a(Message message) {
        bhcg bhcg = this.f118290a;
        if (bhcg.f118292d != null) {
            try {
                message.setTarget(bhcg.f118291c);
                this.f118290a.f118291c.dispatchMessage(message);
                if (this.f118290a.f118292d.mo49124e()) {
                    try {
                        this.f118290a.f118292d.mo49120c();
                    } catch (Exception e) {
                        String valueOf = String.valueOf(e);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                        sb.append("exception when releasing wakelock ");
                        sb.append(valueOf);
                        Log.e("GCoreFlp", sb.toString());
                    }
                }
            } catch (Throwable th) {
                if (this.f118290a.f118292d.mo49124e()) {
                    try {
                        this.f118290a.f118292d.mo49120c();
                    } catch (Exception e2) {
                        String valueOf2 = String.valueOf(e2);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
                        sb2.append("exception when releasing wakelock ");
                        sb2.append(valueOf2);
                        Log.e("GCoreFlp", sb2.toString());
                    }
                }
                throw th;
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }
}

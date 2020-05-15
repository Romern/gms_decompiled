package p000;

import android.util.Log;
import org.apache.http.params.AbstractHttpParams;
import org.apache.http.params.HttpParams;

/* renamed from: abov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abov extends AbstractHttpParams {

    /* renamed from: a */
    final /* synthetic */ abop f57814a;

    public abov(abop abop) {
        this.f57814a = abop;
    }

    public final HttpParams copy() {
        throw new UnsupportedOperationException();
    }

    public final Object getParameter(String str) {
        if ("http.connection.timeout".equals(str)) {
            return Integer.valueOf(((aboy) this.f57814a.f57803a).f57825d);
        }
        String valueOf = String.valueOf(str);
        Log.w("GoogleHttpClient", valueOf.length() == 0 ? new String("Ignoring to get unsupported parameter: ") : "Ignoring to get unsupported parameter: ".concat(valueOf));
        return null;
    }

    public final boolean removeParameter(String str) {
        String valueOf = String.valueOf(str);
        Log.w("GoogleHttpClient", valueOf.length() == 0 ? new String("Ignoring unsupported remove operation for: ") : "Ignoring unsupported remove operation for: ".concat(valueOf));
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [abov, org.apache.http.params.HttpParams], assign insn: null */
    public final HttpParams setParameter(String str, Object obj) {
        if (!"http.conn-manager.timeout".equals(str)) {
            if ("http.socket.timeout".equals(str)) {
                ((aboy) this.f57814a.f57803a).f57824c = ((Integer) obj).intValue();
            } else if ("http.connection.timeout".equals(str)) {
                ((aboy) this.f57814a.f57803a).f57825d = ((Integer) obj).intValue();
            } else {
                String valueOf = String.valueOf(str);
                Log.w("GoogleHttpClient", valueOf.length() == 0 ? new String("Ignoring unsupported parameter: ") : "Ignoring unsupported parameter: ".concat(valueOf));
            }
        }
        return this;
    }
}

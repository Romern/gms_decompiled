package p000;

import android.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.Set;

/* renamed from: axum */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axum implements Runnable {

    /* renamed from: a */
    final /* synthetic */ axuk f96399a;

    /* renamed from: b */
    final /* synthetic */ ayev f96400b;

    /* renamed from: c */
    final /* synthetic */ axuo f96401c;

    public axum(axuo axuo, axuk axuk, ayev ayev) {
        this.f96401c = axuo;
        this.f96399a = axuk;
        this.f96400b = ayev;
    }

    public final void run() {
        axuo axuo = this.f96401c;
        axuk axuk = this.f96399a;
        ayes ayes = this.f96400b.f97381d;
        if (ayes == null) {
            ayes = ayes.f97358f;
        }
        axue a = axue.m83239a(ayes.f97361b, ayes.f97362c);
        Set b = axuo.f96404a.mo53744b(ayes.f97363d);
        if (!b.contains(a)) {
            if (Log.isLoggable("assets", 3)) {
                String valueOf = String.valueOf(a);
                String str = ayes.f97363d;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53 + String.valueOf(str).length());
                sb.append("Fetched asset is missing (sending empty response): ");
                sb.append(valueOf);
                sb.append(", ");
                sb.append(str);
                Log.d("assets", sb.toString());
            }
        } else if (!Collections.unmodifiableMap(axuk.f96391a).containsKey(ayes.f97363d)) {
            File file = null;
            if (!ayes.f97364e) {
                file = axuo.f96404a.mo53731a(ayes.f97363d);
                if (file == null && Log.isLoggable("assets", 3)) {
                    String valueOf2 = String.valueOf(a);
                    String str2 = ayes.f97363d;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 52 + String.valueOf(str2).length());
                    sb2.append("handleFetchAsset: ");
                    sb2.append(valueOf2);
                    sb2.append(", ");
                    sb2.append(str2);
                    sb2.append(", no FD returned, no permission?");
                    Log.d("assets", sb2.toString());
                }
            } else if (Log.isLoggable("assets", 3)) {
                String valueOf3 = String.valueOf(a);
                String str3 = ayes.f97363d;
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 56 + String.valueOf(str3).length());
                sb3.append("handleFetchAsset: ");
                sb3.append(valueOf3);
                sb3.append(", ");
                sb3.append(str3);
                sb3.append(", permission check, not loading data");
                Log.d("assets", sb3.toString());
            }
            axuk.mo53583a(ayes.f97363d, file, (axue[]) b.toArray(new axue[b.size()]));
        } else if (Log.isLoggable("assets", 3)) {
            String valueOf4 = String.valueOf(a);
            String str4 = ayes.f97363d;
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 75 + String.valueOf(str4).length());
            sb4.append("handleFetchAsset: ");
            sb4.append(valueOf4);
            sb4.append(", ");
            sb4.append(str4);
            sb4.append(", ignoring fetch because asset is already in send queue");
            Log.d("assets", sb4.toString());
        }
    }
}

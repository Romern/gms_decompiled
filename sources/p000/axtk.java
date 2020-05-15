package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: axtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axtk implements Callable {

    /* renamed from: a */
    final /* synthetic */ ParcelFileDescriptor f96313a;

    /* renamed from: b */
    final /* synthetic */ byte[] f96314b;

    public axtk(ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.f96313a = parcelFileDescriptor;
        this.f96314b = bArr;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        if (Log.isLoggable("WearableClient", 3)) {
            String valueOf = String.valueOf(this.f96313a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("processAssets: writing data to FD : ");
            sb.append(valueOf);
            Log.d("WearableClient", sb.toString());
        }
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(this.f96313a);
        try {
            autoCloseOutputStream.write(this.f96314b);
            autoCloseOutputStream.flush();
            if (Log.isLoggable("WearableClient", 3)) {
                String valueOf2 = String.valueOf(this.f96313a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
                sb2.append("processAssets: wrote data: ");
                sb2.append(valueOf2);
                Log.d("WearableClient", sb2.toString());
            }
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    String valueOf3 = String.valueOf(this.f96313a);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
                    sb3.append("processAssets: closing: ");
                    sb3.append(valueOf3);
                    Log.d("WearableClient", sb3.toString());
                }
                autoCloseOutputStream.close();
                return true;
            } catch (IOException e) {
                return true;
            }
        } catch (IOException e2) {
            String valueOf4 = String.valueOf(this.f96313a);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 36);
            sb4.append("processAssets: writing data failed: ");
            sb4.append(valueOf4);
            Log.w("WearableClient", sb4.toString());
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    String valueOf5 = String.valueOf(this.f96313a);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 24);
                    sb5.append("processAssets: closing: ");
                    sb5.append(valueOf5);
                    Log.d("WearableClient", sb5.toString());
                }
                autoCloseOutputStream.close();
            } catch (IOException e3) {
            }
            return false;
        } catch (Throwable th) {
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    String valueOf6 = String.valueOf(this.f96313a);
                    StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf6).length() + 24);
                    sb6.append("processAssets: closing: ");
                    sb6.append(valueOf6);
                    Log.d("WearableClient", sb6.toString());
                }
                autoCloseOutputStream.close();
            } catch (IOException e4) {
            }
            throw th;
        }
    }
}

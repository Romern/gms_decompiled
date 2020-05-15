package p000;

import android.content.Context;
import android.os.AsyncTask;
import java.io.IOException;

/* renamed from: jzz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jzz extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ kaa f23592a;

    /* renamed from: b */
    private final Context f23593b;

    public jzz(kaa kaa, Context context) {
        this.f23592a = kaa;
        this.f23593b = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            return qdf.m31915b(this.f23593b);
        } catch (IOException | rfv | rfw e) {
            kaa.f23599d.mo25415d("Could not get device data version info.", e, new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        String str;
        String str2 = (String) obj;
        if (!isCancelled()) {
            Logger Logger = kaa.f23599d;
            String valueOf = String.valueOf(str2);
            Logger.mo25412b(valueOf.length() == 0 ? new String("DeviceDataVersionInfo = ") : "DeviceDataVersionInfo = ".concat(valueOf), new Object[0]);
            if (str2 != null) {
                StringBuilder sb = new StringBuilder(str2.length() + 2);
                sb.append('\'');
                sb.append(str2);
                sb.append('\'');
                str = sb.toString();
            } else {
                str = "null";
            }
            this.f23592a.mo14280f(String.format("window.setDeviceDataVersionInfo(%s);", str));
        }
    }
}

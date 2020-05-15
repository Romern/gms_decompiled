package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.io.ByteArrayOutputStream;

/* renamed from: almq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class almq {

    /* renamed from: a */
    public final ampo f73783a;

    /* renamed from: b */
    public final aodl f73784b = new aodl(this.f73786d);

    /* renamed from: c */
    public final ampm f73785c;

    /* renamed from: d */
    private final ampo f73786d;

    private almq(Context context, int i) {
        ampo ampo = new ampo(context, cgbe.f186279a.mo6606a().mo83440dk(), cgbe.f186279a.mo6606a().mo83439dj(), cgbe.m144174c(), cgbe.m144188q(), cgbe.m144173b(), cgbe.f186279a.mo6606a().mo83450du());
        ampo ampo2 = new ampo(context, cgbe.f186279a.mo6606a().mo83446dq(), cgbe.f186279a.mo6606a().mo83445dp(), cgbe.m144174c(), cgbe.m144188q(), cgbe.m144173b(), cgbe.f186279a.mo6606a().mo83443dn());
        ampm ampm = new ampm(context, i);
        this.f73786d = ampo;
        this.f73783a = ampo2;
        new aoiq(this.f73783a);
        new aodm(this.f73786d);
        new aodr(this.f73786d);
        this.f73785c = ampm;
    }

    /* renamed from: a */
    public static synchronized almq m61303a(Context context, int i) {
        almq almq;
        synchronized (almq.class) {
            almq = new almq(context, i);
        }
        return almq;
    }

    /* renamed from: a */
    public static amph m61304a(Context context, String str, String str2, String str3) {
        ClientContext clientContext;
        amig.m62939a();
        if (!Boolean.valueOf(cgbe.f186279a.mo6606a().mo83257N()).booleanValue()) {
            clientContext = ampi.m63123a(context, str, str3);
        } else {
            int myUid = Process.myUid();
            String packageName = context.getPackageName();
            ClientContext clientContext2 = new ClientContext(myUid, str, str, packageName, packageName);
            amig.m62939a();
            String[] a = ampi.m63124a(cgbe.f186279a.mo6606a().mo83248E());
            if (a.length > 0) {
                clientContext2.mo17799a(a);
            }
            clientContext2.mo17798a("social_client_app_id", str3);
            clientContext = clientContext2;
        }
        return new amph(clientContext, str2);
    }

    /* renamed from: a */
    public static final byte[] m61305a(Context context, Uri uri) {
        byte[] bArr;
        String a = ssa.m36189a(context.getContentResolver(), uri);
        if (a == null || !ssa.m36191b(a)) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Not a image mime type ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        int k = (int) cgbe.m144182k();
        Bitmap a2 = ssa.m36184a(context, uri, k, k, false);
        if (a2 != null) {
            int j = (int) cgbe.m144181j();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                a2.compress(Bitmap.CompressFormat.JPEG, j, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
                try {
                    a2.recycle();
                } catch (OutOfMemoryError e) {
                    e = e;
                }
            } catch (OutOfMemoryError e2) {
                e = e2;
                bArr = null;
                String valueOf2 = String.valueOf(uri);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
                sb2.append("Could not load image from ");
                sb2.append(valueOf2);
                Log.e("DataBroker", sb2.toString(), e);
                return bArr;
            }
            return bArr;
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 22);
        sb3.append("No image decoded from ");
        sb3.append(valueOf3);
        throw new IllegalArgumentException(sb3.toString());
    }
}

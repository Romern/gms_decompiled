package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: aagu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aagu {

    /* renamed from: a */
    private static befa f28093a;

    /* renamed from: a */
    public static aaip m21240a(int i, byte[] bArr) {
        bxvd da = aaip.f28209d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aaip aaip = (aaip) da.f164949b;
        int i2 = i - 1;
        if (i != 0) {
            aaip.f28212b = i2;
            aaip.f28211a |= 1;
            if (bArr != null) {
                ByteString a = ByteString.m123261a(bArr);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                aaip aaip2 = (aaip) da.f164949b;
                a.getClass();
                aaip2.f28211a |= 2;
                aaip2.f28213c = a;
            }
            return (aaip) da.mo74062i();
        }
        throw null;
    }

    /* renamed from: b */
    public static synchronized befa m21243b() {
        befa befa;
        synchronized (aagu.class) {
            if (f28093a == null) {
                f28093a = new befa(Arrays.asList(new befu()), Arrays.asList(new beih()));
            }
            befa = f28093a;
        }
        return befa;
    }

    /* renamed from: a */
    public static Long m21241a() {
        return Long.valueOf(Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")).getTime().getTime());
    }

    /* renamed from: a */
    public static void m21242a(Context context, aaip aaip) {
        Intent startIntent;
        if (context != null && aaip != null && (startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.gass.GassIntentOperation", "com.google.android.gms.gass.ACTION_EXECUTE_TASK")) != null) {
            startIntent.putExtra("IntentParameter", aaip.serializeToBytes());
            context.startService(startIntent);
        }
    }
}

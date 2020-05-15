package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Pair;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.feedback.FeedbackOptions;
import java.security.SecureRandom;
import java.util.List;
import java.util.Locale;

/* renamed from: wzg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wzg {
    /* renamed from: a */
    public static Bundle m42515a(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        Bundle bundle = new Bundle(size);
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) list.get(i);
            bundle.putString((String) pair.first, (String) pair.second);
        }
        return bundle;
    }

    /* renamed from: b */
    public static String m42522b() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("_");
        sb.append(abs);
        return sb.toString();
    }

    @Deprecated
    /* renamed from: a */
    public static String m42516a() {
        long currentTimeMillis = System.currentTimeMillis();
        long abs = Math.abs(new SecureRandom().nextLong());
        StringBuilder sb = new StringBuilder(41);
        sb.append(currentTimeMillis);
        sb.append("-");
        sb.append(abs);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m42517a(Account account) {
        return Integer.toString(account.name.toLowerCase(Locale.ENGLISH).hashCode());
    }

    /* renamed from: a */
    public static void m42518a(Context context, wvd wvd, long j) {
        m42521a(new wyx(context, wvd, j));
        m42521a(new wyy(context, wvd, j));
    }

    /* renamed from: a */
    public static void m42519a(Bundle bundle) {
        if (((Boolean) wzi.f51599e.mo54082a()).booleanValue() && bundle != null) {
            Parcel obtain = Parcel.obtain();
            obtain.writeBundle(bundle);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > ((Integer) wzi.f51598d.mo54082a()).intValue()) {
                String valueOf = String.valueOf(wzi.f51598d.mo54082a());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 86);
                sb.append("Max allowed bundle size of ");
                sb.append(valueOf);
                sb.append(" exceeded, you are passing in a bundle of ");
                sb.append(dataSize);
                sb.append(" size.");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m42520a(FeedbackOptions feedbackOptions) {
        if (((Boolean) wzi.f51599e.mo54082a()).booleanValue() && feedbackOptions != null) {
            Parcel obtain = Parcel.obtain();
            www.m42419a(feedbackOptions, obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize > ((Integer) wzi.f51598d.mo54082a()).intValue()) {
                String valueOf = String.valueOf(wzi.f51598d.mo54082a());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + ErrorInfo.TYPE_SDU_FAILED);
                sb.append("Max allowed feedback options size of ");
                sb.append(valueOf);
                sb.append(" exceeded, you are passing in feedback options of ");
                sb.append(dataSize);
                sb.append(" size.");
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private static void m42521a(Runnable runnable) {
        Thread thread = new Thread(runnable, "Feedback");
        thread.setPriority(4);
        thread.start();
    }
}

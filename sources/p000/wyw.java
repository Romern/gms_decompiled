package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.cast.JGCastService;
import com.google.android.gms.common.Feature;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.List;

/* renamed from: wyw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wyw extends sbm {

    /* renamed from: a */
    public final Context f51585a;

    /* renamed from: I */
    public final Feature[] mo6461I() {
        return wvn.f51429c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ IInterface mo6462a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.feedback.internal.IFeedbackService");
        if (queryLocalInterface instanceof wze) {
            return (wze) queryLocalInterface;
        }
        return new wzc(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo6463a() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo6464b() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* renamed from: d */
    public final int mo6465d() {
        return 11925000;
    }

    public wyw(Context context, Looper looper, rjz rjz, rka rka, sat sat) {
        super(context, looper, 29, sat, rjz, rka);
        this.f51585a = context;
        aymt.m84282a(context);
    }

    /* renamed from: a */
    public final void mo29576a(FeedbackOptions feedbackOptions) {
        String str;
        bxvd da = abeh.f57196I.mo74144da();
        if (TextUtils.isEmpty(feedbackOptions.f31596g)) {
            String packageName = this.f51585a.getApplicationContext().getPackageName();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh = (abeh) da.f164949b;
            packageName.getClass();
            abeh.f57206a |= 2;
            abeh.f57209d = packageName;
        } else {
            String str2 = feedbackOptions.f31596g;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh2 = (abeh) da.f164949b;
            str2.getClass();
            abeh2.f57206a |= 2;
            abeh2.f57209d = str2;
        }
        try {
            str = this.f51585a.getPackageManager().getPackageInfo(((abeh) da.f164949b).f57209d, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            str = null;
        }
        if (str != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh3 = (abeh) da.f164949b;
            str.getClass();
            abeh3.f57207b |= 2;
            abeh3.f57199B = str;
        }
        String str3 = feedbackOptions.f31590a;
        if (!TextUtils.isEmpty(str3) && !str3.equals("anonymous")) {
            String a = wzg.m42517a(new Account(str3, "com.google"));
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh4 = (abeh) da.f164949b;
            a.getClass();
            abeh4.f57206a |= 4;
            abeh4.f57210e = a;
        }
        String str4 = feedbackOptions.f31603n;
        if (str4 != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh5 = (abeh) da.f164949b;
            str4.getClass();
            abeh5.f57206a |= 64;
            abeh5.f57214i = str4;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abeh abeh6 = (abeh) da.f164949b;
        "feedback.android".getClass();
        abeh6.f57206a |= 16;
        abeh6.f57212g = "feedback.android";
        int i = rfi.f42869b;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abeh abeh7 = (abeh) da.f164949b;
        abeh7.f57206a |= JGCastService.FLAG_PRIVATE_DISPLAY;
        abeh7.f57230y = i;
        long currentTimeMillis = System.currentTimeMillis();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abeh abeh8 = (abeh) da.f164949b;
        abeh8.f57206a |= 16777216;
        abeh8.f57225t = currentTimeMillis;
        if (!(feedbackOptions.f31602m == null && feedbackOptions.f31595f == null)) {
            abeh8.f57207b |= 16;
            abeh8.f57202E = true;
        }
        Bundle bundle = feedbackOptions.f31591b;
        if (bundle != null) {
            int size = bundle.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh9 = (abeh) da.f164949b;
            abeh9.f57207b |= 4;
            abeh9.f57200C = size;
        }
        List list = feedbackOptions.f31597h;
        if (list != null && list.size() > 0) {
            int size2 = feedbackOptions.f31597h.size();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abeh abeh10 = (abeh) da.f164949b;
            abeh10.f57207b |= 8;
            abeh10.f57201D = size2;
        }
        abeh abeh11 = (abeh) da.mo74062i();
        bxvd bxvd = (bxvd) abeh11.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) abeh11);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        abeh abeh12 = (abeh) bxvd.f164949b;
        abeh12.f57215j = 164;
        abeh12.f57206a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        wzf.m42514a(this.f51585a, (abeh) bxvd.mo74062i());
    }
}

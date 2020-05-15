package p000;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.people.data.AudienceMember;

/* renamed from: rqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rqc {
    /* renamed from: a */
    public static String m34255a(Intent intent) {
        return intent.getStringExtra("com.google.android.gms.common.audience.EXTRA_ACCOUNT_NAME");
    }

    /* renamed from: b */
    public static int m34256b(Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.common.audience.EXTRA_APP_ID");
        if (!TextUtils.isEmpty(stringExtra)) {
            return Integer.parseInt(stringExtra);
        }
        return 80;
    }

    /* renamed from: c */
    public static String m34257c(Intent intent) {
        return intent.getStringExtra("com.google.android.gms.common.audience.EXTRA_PAGE_ID");
    }

    /* renamed from: d */
    public static AudienceMember m34258d(Intent intent) {
        return (AudienceMember) intent.getParcelableExtra("com.google.android.gms.common.audience.EXTRA_TARGET_PERSON");
    }
}

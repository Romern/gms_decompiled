package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.text.TextUtils;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: mbw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mbw {

    /* renamed from: a */
    private static final lvn f33378a = new lvn("BackupPolicyRestrictions");

    /* renamed from: b */
    private final Context f33379b;

    public mbw(Context context) {
        this.f33379b = context;
    }

    /* renamed from: a */
    public final Pattern mo19819a() {
        String str;
        int i = Build.VERSION.SDK_INT;
        Bundle applicationRestrictions = ((UserManager) this.f33379b.getSystemService("user")).getApplicationRestrictions(this.f33379b.getPackageName());
        if (applicationRestrictions != null) {
            str = applicationRestrictions.getString("backup:allowed_backup_account_regex", null);
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Pattern.compile(str);
        } catch (PatternSyntaxException e) {
            f33378a.mo25418e("Invalid allowed backup account regex.", new Object[0]);
            return null;
        }
    }
}

package p000;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: uzh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uzh extends uza {
    public uzh(String str) {
        super(str, Arrays.asList(m39830a(str, "permissionId"), m39830a(str, "displayName"), m39830a(str, "picture"), m39830a(str, "isAuthenticatedUser"), m39830a(str, "emailAddress")), Collections.emptyList(), 6000000);
    }

    /* renamed from: a */
    private final String m39829a(String str) {
        return m39830a(this.f48653a, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo28091b(DataHolder dataHolder, int i, int i2) {
        return dataHolder.mo17766a(m39829a("permissionId")) && !dataHolder.mo17773f(m39829a("permissionId"), i, i2);
    }

    /* renamed from: a */
    private static String m39830a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + str2.length());
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo28092c(DataHolder dataHolder, int i, int i2) {
        String c = dataHolder.mo17769c(m39829a("permissionId"), i, i2);
        if (c == null) {
            return null;
        }
        String c2 = dataHolder.mo17769c(m39829a("displayName"), i, i2);
        String c3 = dataHolder.mo17769c(m39829a("picture"), i, i2);
        Boolean valueOf = Boolean.valueOf(dataHolder.mo17771d(m39829a("isAuthenticatedUser"), i, i2));
        return new UserMetadata(c, c2, c3, valueOf.booleanValue(), dataHolder.mo17769c(m39829a("emailAddress"), i, i2));
    }
}

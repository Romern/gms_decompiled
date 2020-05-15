package p000;

import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;

/* renamed from: alng */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alng extends alot {

    /* renamed from: a */
    private final Uri f73837a;

    /* renamed from: b */
    private final String f73838b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40608a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final alos mo40609c(Context context) {
        if (!cgbt.m144706b()) {
            return alos.f73976d;
        }
        try {
            return alos.m61435a(new anco(context.getContentResolver().openFileDescriptor(this.f73837a, this.f73838b)), 0, 0, false);
        } catch (FileNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("FileNotFoundException: ");
            sb.append(valueOf);
            sb.toString();
            return alos.f73975c;
        }
    }

    public alng(String str, int i, almp almp, Uri uri, String str2) {
        super(str, i, almp, "GetGalProviderFileDescriptor");
        this.f73837a = uri;
        this.f73838b = str2;
    }
}

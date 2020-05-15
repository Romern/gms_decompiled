package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aluc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aluc {

    /* renamed from: a */
    public String f74287a;

    /* renamed from: b */
    public String f74288b;

    /* renamed from: c */
    public String f74289c;

    /* renamed from: d */
    private Boolean f74290d;

    /* renamed from: e */
    private final List f74291e = new ArrayList();

    /* renamed from: a */
    private static final void m61876a(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(str);
    }

    /* renamed from: a */
    public final void mo40786a(alub alub) {
        this.f74291e.add(alub);
    }

    /* renamed from: a */
    public final void mo40787a(Context context) {
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream;
        try {
            StringBuilder sb = new StringBuilder();
            if (TextUtils.isEmpty(this.f74287a)) {
                m61876a(sb, "name");
            }
            if (TextUtils.isEmpty(this.f74288b)) {
                m61876a(sb, "consentText");
            }
            if (TextUtils.isEmpty(this.f74289c)) {
                m61876a(sb, "component");
            }
            if (this.f74291e.isEmpty()) {
                m61876a(sb, "at least one data source");
            }
            if (sb.length() <= 0) {
                alud alud = new alud(this.f74287a, this.f74288b, this.f74289c, this.f74290d, this.f74291e);
                SharedPreferences sharedPreferences = context.getSharedPreferences("People-DebugUploaderService", 0);
                Set<String> stringSet = sharedPreferences.getStringSet("available_uploaders", new HashSet());
                stringSet.add(alud.f74292a);
                try {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    String str = alud.f74292a;
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(alud);
                    String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    edit.putString(str, encodeToString).putStringSet("available_uploaders", stringSet).commit();
                } catch (IOException e) {
                    new Object[1][0] = alud.f74292a;
                } catch (Throwable th) {
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    throw th;
                }
            } else {
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 35);
                sb2.append("DebugUploader missing parameters: ");
                sb2.append(valueOf);
                sb2.append(".");
                throw new IllegalArgumentException(sb2.toString());
            }
        } catch (IllegalArgumentException e2) {
            Log.e("DebugUploader", "Could not register the debug uploader", e2);
        }
    }

    /* renamed from: a */
    public final void mo40788a(boolean z) {
        this.f74290d = Boolean.valueOf(z);
    }
}

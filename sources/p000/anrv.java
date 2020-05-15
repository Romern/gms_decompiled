package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: anrv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anrv {

    /* renamed from: b */
    private static final Bundle f77556b;

    /* renamed from: a */
    public final aode f77557a;

    /* renamed from: c */
    private final shj f77558c;

    static {
        Bundle bundle = new Bundle();
        f77556b = bundle;
        bundle.putBoolean("force", true);
    }

    public anrv(shj shj, aode aode) {
        this.f77558c = shj;
        this.f77557a = aode;
        shj.f44447g = 6400;
    }

    /* renamed from: a */
    public static String m65079a() {
        return String.format("people/%1$s/moments/%2$s", m65080a("me"), m65080a("vault"));
    }

    /* renamed from: a */
    private static String m65080a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    /* renamed from: a */
    public static final void m65081a(Context context, ClientContext clientContext, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", m65079a());
        contentValues.put("packageName", clientContext.f30216f);
        contentValues.put("accountName", clientContext.mo17802b());
        contentValues.put("payload", str);
        contentResolver.insert(anub.f77731a, contentValues);
        ContentResolver.requestSync(new Account(clientContext.mo17802b(), "com.google"), "com.google.android.gms.plus.action", f77556b);
    }

    /* renamed from: a */
    public final void mo42170a(ClientContext clientContext, String str, String str2) {
        try {
            this.f77558c.mo25539a(clientContext, -1, str, new JSONObject(str2));
        } catch (JSONException e) {
            Log.e("FramesAgent", "Error parsing JSON", e);
        }
    }
}

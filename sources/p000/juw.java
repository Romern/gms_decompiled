package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: juw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class juw {

    /* renamed from: b */
    private static final String f23276b = juw.class.getSimpleName();

    /* renamed from: a */
    public final C1102je f23277a;

    /* renamed from: c */
    private final Context f23278c;

    /* renamed from: d */
    private final JSONObject f23279d = new JSONObject();

    public juw(Context context) {
        this.f23278c = context;
        this.f23277a = new C1102je(context);
    }

    /* renamed from: a */
    public static juw m17367a(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            juw juw = new juw(context);
            juw.mo14130b(jSONObject.optLong("notify_time"));
            juw.mo14125a(jSONObject.optLong("max_duration"));
            juw.mo14127a(jSONObject.optString("big_text"));
            juw.mo14126a(Uri.parse(jSONObject.optString("content_intent_view")));
            juw.mo14134c(jSONObject.optString("content_text"));
            juw.mo14135d(jSONObject.optString("content_title"));
            juw.mo14132b(jSONObject.optBoolean("key_ongoing"));
            juw.mo14124a(jSONObject.optInt("small_icon"));
            juw.mo14136e(jSONObject.optString("ticker"));
            juw.mo14128a(jSONObject.optBoolean("auto_cancel"));
            juw.mo14131b(jSONObject.optString("channel"));
            return juw;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: b */
    public final long mo14129b() {
        return this.f23279d.optLong("notify_time");
    }

    /* renamed from: c */
    public final long mo14133c() {
        return this.f23279d.optLong("max_duration");
    }

    /* renamed from: d */
    public final void mo14135d(CharSequence charSequence) {
        this.f23277a.mo13640e(charSequence);
        m17369a("content_title", charSequence.toString());
    }

    /* renamed from: e */
    public final void mo14136e(CharSequence charSequence) {
        this.f23277a.mo13639d(charSequence);
        m17369a("ticker", charSequence.toString());
    }

    /* renamed from: b */
    public final void mo14130b(long j) {
        m17369a("notify_time", String.valueOf(j));
    }

    /* renamed from: c */
    public final void mo14134c(CharSequence charSequence) {
        this.f23277a.mo13632b(charSequence);
        m17369a("content_text", charSequence.toString());
    }

    /* renamed from: b */
    public final void mo14131b(CharSequence charSequence) {
        this.f23277a.f22244B = charSequence.toString();
        m17369a("channel", charSequence.toString());
    }

    /* renamed from: b */
    public final void mo14132b(boolean z) {
        this.f23277a.mo13633b(z);
        m17369a("key_ongoing", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public static juw m17368a(Context context, juw juw) {
        return m17367a(context, juw.mo14123a());
    }

    /* renamed from: a */
    private final void m17369a(String str, Object obj) {
        try {
            this.f23279d.put(str, obj);
        } catch (JSONException e) {
            Log.w(f23276b, "JSONException putting field into object!", e);
        }
    }

    /* renamed from: a */
    public final String mo14123a() {
        return this.f23279d.toString();
    }

    /* renamed from: a */
    public final void mo14124a(int i) {
        this.f23277a.mo13630b(i);
        m17369a("small_icon", Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo14125a(long j) {
        m17369a("max_duration", String.valueOf(j));
    }

    /* renamed from: a */
    public final void mo14126a(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setFlags(268435456);
        this.f23277a.f22254f = PendingIntent.getActivity(this.f23278c, 0, intent, 134217728);
        m17369a("content_intent_view", uri.toString());
    }

    /* renamed from: a */
    public final void mo14127a(CharSequence charSequence) {
        C1102je jeVar = this.f23277a;
        C1101jd jdVar = new C1101jd();
        jdVar.mo13593a(charSequence);
        jeVar.mo13626a(jdVar);
        m17369a("big_text", charSequence.toString());
    }

    /* renamed from: a */
    public final void mo14128a(boolean z) {
        this.f23277a.mo13627a(z);
        m17369a("auto_cancel", Boolean.valueOf(z));
    }
}

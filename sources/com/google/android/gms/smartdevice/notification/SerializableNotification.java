package com.google.android.gms.smartdevice.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SerializableNotification implements Parcelable {
    public static final Parcelable.Creator CREATOR = new arse();

    /* renamed from: m */
    private static final sek f108083m = ascp.m73787a("Notification", "SerializableNotification");

    /* renamed from: a */
    public long f108084a;

    /* renamed from: b */
    public long f108085b;

    /* renamed from: c */
    public long f108086c;

    /* renamed from: d */
    public CharSequence f108087d;

    /* renamed from: e */
    public Uri f108088e;

    /* renamed from: f */
    public CharSequence f108089f;

    /* renamed from: g */
    public CharSequence f108090g;

    /* renamed from: h */
    public boolean f108091h;

    /* renamed from: i */
    public int f108092i;

    /* renamed from: j */
    public CharSequence f108093j;

    /* renamed from: k */
    public boolean f108094k;

    /* renamed from: l */
    public boolean f108095l;

    public SerializableNotification() {
    }

    /* renamed from: a */
    public static SerializableNotification m92793a(SerializableNotification serializableNotification) {
        return m92794a(serializableNotification.mo59140a());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f108084a);
        parcel.writeLong(this.f108085b);
        parcel.writeLong(this.f108086c);
        TextUtils.writeToParcel(this.f108087d, parcel, i);
        Uri uri = this.f108088e;
        parcel.writeString(uri != null ? uri.toString() : null);
        TextUtils.writeToParcel(this.f108089f, parcel, i);
        TextUtils.writeToParcel(this.f108090g, parcel, i);
        parcel.writeInt(this.f108091h ? 1 : 0);
        parcel.writeInt(this.f108092i);
        TextUtils.writeToParcel(this.f108093j, parcel, i);
        parcel.writeInt(this.f108094k ? 1 : 0);
        parcel.writeInt(this.f108095l ? 1 : 0);
    }

    public SerializableNotification(Parcel parcel) {
        this.f108084a = parcel.readLong();
        this.f108085b = parcel.readLong();
        this.f108086c = parcel.readLong();
        this.f108087d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        String readString = parcel.readString();
        this.f108088e = readString != null ? Uri.parse(readString) : null;
        this.f108089f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f108090g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        boolean z = true;
        this.f108091h = parcel.readInt() != 0;
        this.f108092i = parcel.readInt();
        this.f108093j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f108094k = parcel.readInt() != 0;
        this.f108095l = parcel.readInt() == 0 ? false : z;
    }

    /* renamed from: a */
    public static SerializableNotification m92794a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            SerializableNotification serializableNotification = new SerializableNotification();
            serializableNotification.f108084a = jSONObject.optLong("notify_time");
            serializableNotification.f108085b = jSONObject.optLong("max_duration");
            serializableNotification.f108086c = jSONObject.optLong("delay");
            serializableNotification.f108087d = jSONObject.optString("big_text");
            serializableNotification.f108088e = Uri.parse(jSONObject.optString("content_intent_view"));
            serializableNotification.f108089f = jSONObject.optString("content_text");
            serializableNotification.f108090g = jSONObject.optString("content_title");
            serializableNotification.f108091h = jSONObject.optBoolean("key_ongoing");
            serializableNotification.f108092i = jSONObject.optInt("small_icon");
            serializableNotification.f108093j = jSONObject.optString("ticker");
            serializableNotification.f108094k = jSONObject.optBoolean("auto_cancel");
            serializableNotification.f108095l = jSONObject.optBoolean("local_only");
            return serializableNotification;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static SerializableNotification m92795a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        return (SerializableNotification) CREATOR.createFromParcel(obtain);
    }

    /* renamed from: a */
    private static void m92796a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            f108083m.mo25415d("JSONException putting field into object!", e, new Object[0]);
        }
    }

    /* renamed from: a */
    public final Notification mo59139a(Context context) {
        C1102je jeVar = new C1102je(context);
        if (this.f108087d != null) {
            C1101jd jdVar = new C1101jd();
            jdVar.mo13593a(this.f108087d);
            jeVar.mo13626a(jdVar);
        }
        Uri uri = this.f108088e;
        if (uri != null) {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435456);
            jeVar.f22254f = PendingIntent.getActivity(context, 0, intent, 134217728);
        }
        jeVar.mo13632b(this.f108089f);
        jeVar.mo13640e(this.f108090g);
        jeVar.mo13633b(this.f108091h);
        jeVar.mo13630b(this.f108092i);
        jeVar.mo13639d(this.f108093j);
        jeVar.mo13627a(this.f108094k);
        jeVar.f22268t = this.f108095l;
        return jeVar.mo13629b();
    }

    /* renamed from: a */
    public final String mo59140a() {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        m92796a(jSONObject, "notify_time", String.valueOf(this.f108084a));
        m92796a(jSONObject, "max_duration", String.valueOf(this.f108085b));
        m92796a(jSONObject, "delay", String.valueOf(this.f108086c));
        CharSequence charSequence = this.f108087d;
        String str3 = null;
        if (charSequence != null) {
            str = charSequence.toString();
        } else {
            str = null;
        }
        m92796a(jSONObject, "big_text", str);
        Uri uri = this.f108088e;
        if (uri != null) {
            str2 = uri.toString();
        } else {
            str2 = null;
        }
        m92796a(jSONObject, "content_intent_view", str2);
        CharSequence charSequence2 = this.f108089f;
        m92796a(jSONObject, "content_text", charSequence2 != null ? charSequence2.toString() : null);
        CharSequence charSequence3 = this.f108090g;
        m92796a(jSONObject, "content_title", charSequence3 != null ? charSequence3.toString() : null);
        m92796a(jSONObject, "key_ongoing", Boolean.valueOf(this.f108091h));
        m92796a(jSONObject, "small_icon", Integer.valueOf(this.f108092i));
        CharSequence charSequence4 = this.f108093j;
        if (charSequence4 != null) {
            str3 = charSequence4.toString();
        }
        m92796a(jSONObject, "ticker", str3);
        m92796a(jSONObject, "auto_cancel", Boolean.valueOf(this.f108094k));
        m92796a(jSONObject, "local_only", Boolean.valueOf(this.f108095l));
        return jSONObject.toString();
    }
}

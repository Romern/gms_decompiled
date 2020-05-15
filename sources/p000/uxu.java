package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.drive.internal.model.File;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;

/* renamed from: uxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uxu extends uyk {
    public uxu(uvy uvy) {
        super(uvy, false, null);
    }

    /* renamed from: a */
    public static String m39695a(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 85, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28099a(ujx ujx, String str) {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ String mo28105b(Object obj, String str) {
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) obj;
        throw new UnsupportedOperationException("Cannot convert a Bitmap metadata value directly to a Genoa query value.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo28102a(JSONObject jSONObject) {
        byte[] decode = Base64.decode(jSONObject.getString(this.f48716b.mo28084a()), 8);
        return new BitmapTeleporter(BitmapFactory.decodeByteArray(decode, 0, decode.length));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ String mo28107a(Object obj) {
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) obj;
        throw new UnsupportedOperationException("Cannot convert a Bitmap metadata value directly to a database value.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28100a(File file, Object obj) {
        String str;
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) obj;
        if (file.f30975R == null) {
            file.f30975R = new File.Thumbnail();
            file.f30983a.add(71);
        }
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
        File.Thumbnail thumbnail = file.f30975R;
        thumbnail.f31020b = m39695a(bitmapTeleporter.mo17759a(), compressFormat);
        thumbnail.f31019a.add(2);
        File.Thumbnail thumbnail2 = file.f30975R;
        int i = uxt.f48705a[compressFormat.ordinal()];
        if (i == 1) {
            str = "image/jpeg";
        } else if (i == 2) {
            str = "image/png";
        } else if (i == 3) {
            str = "image/webp";
        } else {
            String valueOf = String.valueOf(compressFormat);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Unexpected CompressFormat: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        thumbnail2.f31021c = str;
        thumbnail2.f31019a.add(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28104a(JSONObject jSONObject, Object obj) {
        jSONObject.put(this.f48716b.mo28084a(), m39695a(((BitmapTeleporter) obj).mo17759a(), Bitmap.CompressFormat.PNG));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo28101a(ujx ujx, String str, Object obj, long j) {
        BitmapTeleporter bitmapTeleporter = (BitmapTeleporter) obj;
    }
}

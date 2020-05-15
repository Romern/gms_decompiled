package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.util.Log;
import com.google.android.gms.plus.audience.AudienceSelectionListPersonView;
import java.io.InputStream;

/* renamed from: anoo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anoo extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ String f77311a;

    /* renamed from: b */
    final /* synthetic */ Object f77312b;

    /* renamed from: c */
    final /* synthetic */ AudienceSelectionListPersonView f77313c;

    /* renamed from: d */
    final /* synthetic */ boolean f77314d;

    /* renamed from: e */
    final /* synthetic */ anpb f77315e;

    public anoo(anpb anpb, String str, Object obj, AudienceSelectionListPersonView audienceSelectionListPersonView, boolean z) {
        this.f77315e = anpb;
        this.f77311a = str;
        this.f77312b = obj;
        this.f77313c = audienceSelectionListPersonView;
        this.f77314d = z;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        try {
            anpb anpb = this.f77315e;
            int i = anpb.f77340E;
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(anpb.f78589M.getContentResolver(), Uri.parse(this.f77311a));
            if (openContactPhotoInputStream != null) {
                return BitmapFactory.decodeStream(openContactPhotoInputStream);
            }
            return null;
        } catch (Exception e) {
            Log.e("AudienceSelectionAdapter", "Exception opening ContactsDB avatar", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            anpb anpb = this.f77315e;
            int i = anpb.f77340E;
            anpb.f77344D.mo15547a(this.f77311a, bitmap);
            Object obj2 = this.f77312b;
            AudienceSelectionListPersonView audienceSelectionListPersonView = this.f77313c;
            if (obj2 == audienceSelectionListPersonView.f77417d) {
                this.f77315e.mo42060a(audienceSelectionListPersonView, bitmap, this.f77314d);
            }
        }
    }
}

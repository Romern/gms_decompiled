package p000;

import android.content.ContentValues;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* renamed from: ayar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayar {

    /* renamed from: a */
    final /* synthetic */ ConnectionConfiguration f96962a;

    public ayar(ConnectionConfiguration connectionConfiguration) {
        this.f96962a = connectionConfiguration;
    }

    /* renamed from: a */
    public final void mo53840a(byqy byqy, byqy byqy2) {
        aydn c = ayha.m83997c();
        String str = this.f96962a.f110864a;
        ayfn ayfn = c.f97221b;
        ContentValues contentValues = new ContentValues();
        if (byqy == null && byqy2 == null) {
            contentValues.put("crypto", "");
        } else if (byqy2 != null) {
            byte[] bArr = new byte[146];
            byte[] h = byqy.mo74484h();
            byte[] h2 = byqy2.mo74484h();
            System.arraycopy(h, 0, bArr, 0, 73);
            System.arraycopy(h2, 0, bArr, 73, 73);
            contentValues.put("crypto", boan.f132470d.mo68794a(bArr));
        } else {
            contentValues.put("crypto", boan.f132470d.mo68794a(byqy.mo74484h()));
        }
        ayfn.f97489a.getWritableDatabase().update("connectionConfigurations", contentValues, "name=?", new String[]{str});
    }
}

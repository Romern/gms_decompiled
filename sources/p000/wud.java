package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.chimera.ContentProvider;

/* renamed from: wud */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class wud extends ContentProvider {
    public final Bundle call(String str, String str2, Bundle bundle) {
        if (!"getCardList".equals(str)) {
            return super.call(str, str2, bundle);
        }
        Bundle bundle2 = new Bundle();
        bxvd da = blu.f5122b.mo74144da();
        bxvd da2 = blt.f5116e.mo74144da();
        String uri = busp.m120391a("pair_header_suggestion").toString();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        blt blt = (blt) da2.f164949b;
        uri.getClass();
        int i = blt.f5118a | 1;
        blt.f5118a = i;
        blt.f5119b = uri;
        "pair_header_suggestion".getClass();
        int i2 = i | 2;
        blt.f5118a = i2;
        blt.f5120c = "pair_header_suggestion";
        blt.f5121d = 3;
        blt.f5118a = i2 | 4;
        da.mo73995a((blt) da2.mo74062i());
        bxvd da3 = blt.f5116e.mo74144da();
        String uri2 = busp.m120391a("ota_contextual_cards").toString();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        blt blt2 = (blt) da3.f164949b;
        uri2.getClass();
        int i3 = blt2.f5118a | 1;
        blt2.f5118a = i3;
        blt2.f5119b = uri2;
        "ota_contextual_cards".getClass();
        int i4 = i3 | 2;
        blt2.f5118a = i4;
        blt2.f5120c = "ota_contextual_cards";
        blt2.f5121d = 3;
        blt2.f5118a = i4 | 4;
        da.mo73995a((blt) da3.mo74062i());
        bundle2.putByteArray("cardList", ((blu) da.mo74062i()).serializeToBytes());
        return bundle2;
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}

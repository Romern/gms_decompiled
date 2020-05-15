package p000;

import android.content.Context;

/* renamed from: ahgx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ahgx extends ahgw {
    public ahgx(Context context, String str, String str2) {
        super(context, str, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final bxxc mo36472b(byte[] bArr) {
        try {
            return ((bxxc) mo36458a()).mo73645aM().mo73633b(bArr).mo74062i();
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ahgx", "b", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Failed to merge proto, bytes length=%s", bArr.length);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo36460a(byte[] bArr) {
        try {
            return ((bxxc) mo36458a()).mo73645aM().mo73633b(bArr).mo74062i();
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ahgx", "b", 37, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("Failed to merge proto, bytes length=%s", bArr.length);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final byte[] mo36467c(bxxc bxxc) {
        try {
            return bxxc.mo73642k();
        } catch (OutOfMemoryError e) {
            bnsl bnsl = (bnsl) ahfp.f67119a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ahgx", "a", 26, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to convert proto to bytes");
            return null;
        }
    }
}

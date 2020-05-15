package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.provider.ContactsContract;

/* renamed from: amvv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvv extends amvu {

    /* renamed from: c */
    public final ContentResolver f76147c;

    public amvv(Account account, boolean z, ContentResolver contentResolver, amwn amwn, anaz anaz) {
        super(amvt.m63472a(ContactsContract.RawContacts.CONTENT_URI, account, z), amwn, anaz);
        this.f76147c = contentResolver;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(android.net.Uri, java.lang.String, java.lang.Long, boolean):void
     arg types: [android.net.Uri, java.lang.String, java.lang.Long, int]
     candidates:
      amvu.a(android.net.Uri, long, java.lang.String, java.lang.Long):void
      amvu.a(android.net.Uri, java.lang.Long, android.content.ContentValues, boolean):void
      amvu.a(android.net.Uri, java.lang.String, java.lang.Long, boolean):void */
    /* renamed from: a */
    public final void mo41462a(Long l) {
        mo41458a(this.f76144a, "dirty", l, true);
    }
}

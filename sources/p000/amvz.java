package p000;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.net.Uri;
import android.provider.ContactsContract;

/* renamed from: amvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class amvz {
    /* renamed from: a */
    public static ContentProviderOperation.Builder m63509a(long j) {
        return ContentProviderOperation.newDelete(ContentUris.withAppendedId(amvt.m63470a(ContactsContract.Data.CONTENT_URI), j));
    }

    /* renamed from: a */
    public static ContentProviderOperation.Builder m63510a(long j, long j2) {
        Uri withAppendedId = ContentUris.withAppendedId(amvt.m63470a(ContactsContract.Data.CONTENT_URI), j);
        StringBuilder sb = new StringBuilder(33);
        sb.append("data_version=");
        sb.append(j2);
        return ContentProviderOperation.newUpdate(withAppendedId).withSelection(sb.toString(), null);
    }
}

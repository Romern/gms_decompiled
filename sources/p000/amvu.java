package p000;

import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.ContentValues;
import android.net.Uri;

/* renamed from: amvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class amvu {

    /* renamed from: a */
    public final Uri f76144a;

    /* renamed from: b */
    public final amwn f76145b;

    /* renamed from: c */
    private final anaz f76146c;

    public amvu(Uri uri, amwn amwn, anaz anaz) {
        this.f76144a = uri;
        this.f76145b = amwn;
        this.f76146c = anaz;
    }

    /* renamed from: a */
    public final int mo41452a(Uri uri, ContentValues contentValues, Long l, Integer num, boolean z) {
        ContentProviderOperation.Builder withValues = ContentProviderOperation.newInsert(uri).withValues(contentValues);
        if (l != null) {
            withValues.withValue("raw_contact_id", l);
        }
        if (num != null) {
            withValues.withValueBackReference("raw_contact_id", num.intValue());
        }
        int a = this.f76145b.mo41496a(withValues, z);
        ((anbh) this.f76146c).f76541a.stats.numInserts++;
        return a;
    }

    /* renamed from: a */
    public final int mo41453a(Uri uri, ContentValues contentValues, boolean z) {
        String[] strArr = amvt.f76137a;
        return mo41452a(uri, contentValues, (Long) null, (Integer) null, z);
    }

    /* renamed from: a */
    public final void mo41454a(Uri uri, long j, String str, Long l) {
        this.f76145b.mo41496a(ContentProviderOperation.newAssertQuery(ContentUris.withAppendedId(uri, j)).withValue(str, l).withExpectedCount(1), false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(android.net.Uri, java.lang.Long, android.content.ContentValues, boolean, boolean):void
     arg types: [android.net.Uri, java.lang.Long, android.content.ContentValues, boolean, int]
     candidates:
      amvu.a(android.net.Uri, android.content.ContentValues, java.lang.Long, java.lang.Integer, boolean):int
      amvu.a(android.net.Uri, java.lang.Long, android.content.ContentValues, boolean, boolean):void */
    /* renamed from: a */
    public final void mo41455a(Uri uri, Long l, ContentValues contentValues, boolean z) {
        mo41456a(uri, l, contentValues, z, true);
    }

    /* renamed from: a */
    public final void mo41456a(Uri uri, Long l, ContentValues contentValues, boolean z, boolean z2) {
        ContentProviderOperation.Builder withValues = ContentProviderOperation.newUpdate(uri).withValues(contentValues);
        if (l != null) {
            String valueOf = String.valueOf(l);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4);
            sb.append("_id=");
            sb.append(valueOf);
            String sb2 = sb.toString();
            String[] strArr = amvt.f76137a;
            withValues.withSelection(sb2, null);
        }
        this.f76145b.mo41496a(withValues, z);
        if (z2) {
            ((anbh) this.f76146c).f76541a.stats.numUpdates++;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(android.net.Uri, java.lang.String, java.lang.Long, boolean):void
     arg types: [android.net.Uri, java.lang.String, java.lang.Long, int]
     candidates:
      amvu.a(android.net.Uri, long, java.lang.String, java.lang.Long):void
      amvu.a(android.net.Uri, java.lang.Long, android.content.ContentValues, boolean):void
      amvu.a(android.net.Uri, java.lang.String, java.lang.Long, boolean):void */
    /* renamed from: a */
    public final void mo41457a(Uri uri, String str, Long l) {
        mo41458a(uri, str, l, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41458a(Uri uri, String str, Long l, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(str, Integer.valueOf(z ? 1 : 0));
        amig.m62939a();
        mo41455a(uri, l, contentValues, ((Boolean) amfl.f74862a.mo41191a()).booleanValue());
    }

    /* renamed from: a */
    public final void mo41459a(Uri uri, String str, String str2) {
        this.f76145b.mo41496a(ContentProviderOperation.newAssertQuery(uri).withSelection(str.concat("=?"), new String[]{str2}).withExpectedCount(0), false);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: amvu.a(android.net.Uri, java.lang.Long, android.content.ContentValues, boolean):void
     arg types: [android.net.Uri, java.lang.Long, android.content.ContentValues, int]
     candidates:
      amvu.a(android.net.Uri, long, java.lang.String, java.lang.Long):void
      amvu.a(android.net.Uri, java.lang.String, java.lang.Long, boolean):void
      amvu.a(android.net.Uri, java.lang.Long, android.content.ContentValues, boolean):void */
    /* renamed from: a */
    public final void mo41460a(Long l, ContentValues contentValues) {
        mo41455a(this.f76144a, l, contentValues, false);
    }

    /* renamed from: a */
    public final void mo41461a(Long l, boolean z) {
        this.f76145b.mo41496a(ContentProviderOperation.newDelete(ContentUris.withAppendedId(this.f76144a, l.longValue())), z);
        ((anbh) this.f76146c).f76541a.stats.numDeletes++;
    }
}

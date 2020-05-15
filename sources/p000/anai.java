package p000;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: anai */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class anai {

    /* renamed from: a */
    final amwl f76476a;

    /* renamed from: b */
    protected final anaz f76477b;

    /* renamed from: c */
    protected final boolean f76478c = ((Boolean) amhy.f74927a.mo41191a()).booleanValue();

    /* renamed from: d */
    private final String f76479d;

    /* renamed from: e */
    private final amvm f76480e;

    /* renamed from: f */
    private final amyt f76481f;

    /* renamed from: g */
    private final Uri f76482g;

    protected anai(String str, amwl amwl, amyt amyt, amvm amvm, Uri uri, anaz anaz) {
        this.f76479d = str;
        this.f76481f = amyt;
        this.f76476a = amwl;
        this.f76480e = amvm;
        this.f76482g = uri;
        this.f76477b = anaz;
        amig.m62939a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract amvs mo41585a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract amvs mo41586a(amvs amvs, boolean z, anah anah);

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0093, code lost:
        if (r1 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x009b, code lost:
        if (android.text.TextUtils.isEmpty(r1.f76135a) == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a3, code lost:
        if (android.text.TextUtils.isEmpty(r1.f76136b) != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ad, code lost:
        if (android.text.TextUtils.isEmpty(r1.f76136b) != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b5, code lost:
        r12.mo41608b(r1.f76135a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c9, code lost:
        throw new p000.amyc(new p000.amyb(mo41590d()));
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* renamed from: a */
    public final void mo41592a(anaq anaq) {
        amvs a;
        sdo.m34974b(true);
        amvs a2 = mo41585a();
        String str = a2.f76135a;
        String str2 = a2.f76136b;
        if (this.f76476a.f76191a.f76194a) {
            ((anbh) this.f76477b).f76547g = true;
        }
        if (TextUtils.isEmpty(str)) {
            mo41589c();
            if (TextUtils.isEmpty(str2)) {
                amyt amyt = this.f76481f;
                Uri uri = this.f76482g;
                ContentValues contentValues = new ContentValues();
                contentValues.put("sync2", "SWEEP_MARK");
                ContentProviderOperation build = ContentProviderOperation.newUpdate(amvt.m63471a(uri, amyt.f76410a)).withValues(contentValues).withSelection("sourceid IS NOT NULL", null).build();
                build.toString().replace("%40g", "%%40g");
                amyt.mo41573a(build, "mark");
            }
        }
        anah anah = new anah(this, anaq);
        amig.m62939a();
        int intValue = Integer.valueOf((int) cfvk.f185780a.mo6606a().mo82950aN()).intValue();
        int i = 0;
        loop0:
        while (true) {
            amvs amvs = new amvs(str, str2);
            int i2 = intValue;
            while (true) {
                this.f76480e.mo41389a();
                try {
                    a = mo41586a(amvs, i == 0, anah);
                    break;
                } catch (chuw e) {
                    if ((e.f189236a.f189233s != chus.FAILED_PRECONDITION || !e.getMessage().contains("EXPIRED_SYNC_TOKEN")) && (e.f189236a.f189233s != chus.ABORTED || !e.getMessage().contains("INVALID_PAGE_TOKEN"))) {
                        if (e.f189236a.f189233s == chus.DEADLINE_EXCEEDED) {
                            i2--;
                            if (i2 > 0) {
                                amdk.m62658a(this.f76479d, "Deadline exceeded. %d remaining attempts.", Integer.valueOf(i2));
                            } else {
                                Log.e(this.f76479d, "Too many times deadline exceeded.");
                                throw new amyc(new amyb(7));
                            }
                        } else {
                            throw new amyc(e);
                        }
                    } else if (i != 0) {
                    }
                }
            }
            str2 = a.f76136b;
            anaq.mo41606a(str2);
        }
        if (i != 0) {
            Log.w(this.f76479d, "Stale sync token in first page, reverting to full sync");
            mo41588b();
            mo41592a(anaq);
            return;
        }
        Log.e(this.f76479d, "Stale sync token in non-first page, terminating and restart a new sync");
        throw new amyc(new amyb(6));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo41587a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo41588b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo41589c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo41590d();
}

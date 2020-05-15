package p000;

import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.util.Log;
import com.google.android.chimera.AsyncTaskLoader;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.p015ui.context.section.LoaderSectionInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: fyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class fyd extends AsyncTaskLoader {

    /* renamed from: n */
    private static final String[] f17595n = {"_id", "display_name"};

    /* renamed from: a */
    public boolean f17596a;

    /* renamed from: b */
    private final Context f17597b;

    /* renamed from: c */
    private final String f17598c;

    /* renamed from: d */
    private final List f17599d;

    /* renamed from: e */
    private final boolean f17600e;

    /* renamed from: f */
    private final boolean f17601f;

    /* renamed from: g */
    private final rkb f17602g;

    /* renamed from: h */
    private final fxa f17603h;

    /* renamed from: i */
    private final fxy f17604i;

    /* renamed from: j */
    private boolean f17605j = true;

    /* renamed from: k */
    private fzl f17606k;

    /* renamed from: l */
    private Cursor f17607l;

    /* renamed from: m */
    private Thread f17608m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fyd(Context context, String str, LoaderSectionInfo loaderSectionInfo, fxa fxa, boolean z) {
        super(context);
        rjy rjy = new rjy(context.getApplicationContext());
        rjy.mo24778a(str);
        rjo rjo = allr.f73629a;
        allp a = allq.m61232a();
        a.f73626a = 80;
        rjy.mo24780a(rjo, a.mo40491a());
        rkb b = rjy.mo24784b();
        this.f17597b = context;
        this.f17598c = str;
        this.f17599d = loaderSectionInfo.f9799l;
        this.f17600e = "useCachedContacts".equals(loaderSectionInfo.f9791d);
        this.f17601f = "useLocalContactsOnly".equals(loaderSectionInfo.f9791d);
        this.f17602g = b;
        this.f17603h = fxa;
        this.f17604i = new fxy(loaderSectionInfo.f9789b, true, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo11506a() {
        if (this.f17605j) {
            this.f17605j = false;
            fzl fzl = new fzl();
            this.f17606k = fzl;
            List list = this.f17599d;
            if (list != null) {
                fzl.mo11563a(list);
            }
            if (C1133kh.m17835a(getContext(), "android.permission.READ_CONTACTS") == 0) {
                this.f17607l = getContext().getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, f17595n, "in_visible_group = 1", null, "display_name ASC");
            }
            if (!this.f17601f) {
                Thread thread = new Thread(new fyc(this, this.f17602g, this.f17606k, this.f17604i, this.f17598c, this.f17600e, this.f17603h));
                this.f17608m = thread;
                thread.start();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r0.size() <= 0) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        return null;
     */
    /* renamed from: b */
    public final synchronized HashMap mo11507b() {
        long j;
        if (this.f17607l == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (this.f17607l.isBeforeFirst()) {
            j = cbvz.f178436a.mo6606a().mo75531n();
        } else {
            j = cbvz.f178436a.mo6606a().mo75532o();
        }
        int i = (int) j;
        while (hashMap.size() < i && this.f17607l.moveToNext()) {
            String string = this.f17607l.getString(0);
            String string2 = this.f17607l.getString(1);
            long longValue = Long.decode(string).longValue();
            hashMap.put(string, new ContactPerson(string2, null, Long.valueOf(longValue), null, new ArrayList()));
        }
        if (this.f17607l.isAfterLast()) {
            this.f17607l.close();
            this.f17607l = null;
            fxa fxa = this.f17603h;
            if (fxa != null) {
                fxa.mo7258h();
            }
        }
    }

    /* renamed from: c */
    public final void mo11508c() {
        ArrayList arrayList;
        synchronized (this) {
            Thread thread = this.f17608m;
            if (thread != null) {
                if (!thread.isAlive()) {
                    this.f17608m = null;
                }
            }
            boolean z = false;
            if (this.f17607l == null && this.f17608m == null) {
                z = true;
            }
            this.f17596a = z;
        }
        if (isStarted()) {
            synchronized (this) {
                fzl fzl = this.f17606k;
                getContext();
                fzl.mo11562a();
                arrayList = new ArrayList(this.f17606k.f17738a);
            }
            super.deliverResult(arrayList);
            if (!this.f17596a) {
                onContentChanged();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void deliverResult(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        mo11508c();
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
        synchronized (this) {
            Cursor cursor = this.f17607l;
            if (cursor != null) {
                cursor.close();
                this.f17607l = null;
            }
            Thread thread = this.f17608m;
            if (thread != null) {
                thread.interrupt();
                this.f17608m = null;
            }
            this.f17605j = true;
        }
        this.f17596a = false;
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        if (this.f17596a) {
            mo11508c();
        }
        synchronized (this) {
            if (takeContentChanged() || this.f17605j) {
                forceLoad();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onStopLoading() {
        cancelLoad();
        this.f17602g.mo24803g();
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Thread thread;
        ContactPerson contactPerson;
        mo11506a();
        fzl fzl = new fzl();
        HashMap b = mo11507b();
        if (b != null) {
            fxz fxz = new fxz(this.f17597b, b);
            HashMap hashMap = fxz.f17574b;
            StringBuilder sb = new StringBuilder(hashMap.size() * 5);
            String str = "";
            for (String str2 : hashMap.keySet()) {
                sb.append(str);
                sb.append(str2);
                str = ",";
            }
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 16);
            sb3.append("contact_id in (");
            sb3.append(sb2);
            sb3.append(")");
            Cursor query = fxz.f17573a.getContentResolver().query(fxz.f17576e, fxz.f17572f, sb3.toString(), null, null);
            int columnIndex = query.getColumnIndex("_id");
            StringBuilder sb4 = new StringBuilder(query.getCount() * 5);
            String str3 = "";
            while (query.moveToNext()) {
                String string = query.getString(columnIndex);
                sb4.append(str3);
                sb4.append(string);
                str3 = ",";
            }
            query.close();
            String sb5 = sb4.toString();
            StringBuilder sb6 = new StringBuilder(String.valueOf(sb5).length() + 121);
            sb6.append("raw_contact_id in (");
            sb6.append(sb5);
            sb6.append(") AND (mimetype = 'vnd.android.cursor.item/email_v2' OR mimetype = 'vnd.android.cursor.item/phone_v2')");
            Cursor query2 = fxz.f17573a.getContentResolver().query(fxz.f17575c, fxz.f17571d, sb6.toString(), null, "is_super_primary DESC, is_primary DESC");
            int columnIndex2 = query2.getColumnIndex("data1");
            int columnIndex3 = query2.getColumnIndex("mimetype");
            int columnIndex4 = query2.getColumnIndex("contact_id");
            while (query2.moveToNext()) {
                String string2 = query2.getString(columnIndex4);
                if (!(string2 == null || string2.isEmpty() || (contactPerson = (ContactPerson) fxz.f17574b.get(string2)) == null)) {
                    ArrayList arrayList = contactPerson.f9753e;
                    String string3 = query2.getString(columnIndex2);
                    String string4 = query2.getString(columnIndex3);
                    if ("vnd.android.cursor.item/email_v2".equals(string4)) {
                        arrayList.add(new ContactPerson.ContactMethod(1, string3));
                    } else if ("vnd.android.cursor.item/phone_v2".equals(string4)) {
                        arrayList.add(new ContactPerson.ContactMethod(2, string3));
                    } else {
                        StringBuilder sb7 = new StringBuilder(String.valueOf(string4).length() + 37 + string2.length());
                        sb7.append("Unexpected mimetype ");
                        sb7.append(string4);
                        sb7.append(" for Contact Id: ");
                        sb7.append(string2);
                        Log.w("Cp2ContactMethods", sb7.toString());
                    }
                }
            }
            query2.close();
            for (ContactPerson contactPerson2 : b.values()) {
                if (contactPerson2 != null) {
                    this.f17604i.mo11502a(contactPerson2.f9753e);
                    if (contactPerson2.f9753e.size() > 0) {
                        fzl.mo11561a(contactPerson2);
                    }
                }
            }
            synchronized (this) {
                this.f17606k.mo11563a(fzl.f17738a);
            }
        } else {
            synchronized (this) {
                thread = this.f17608m;
            }
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                }
            }
        }
        return fzl.f17738a;
    }
}

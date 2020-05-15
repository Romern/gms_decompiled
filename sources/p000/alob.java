package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.model.AccountMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: alob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alob extends alnb {

    /* renamed from: y */
    private static final Set f73900y = new HashSet();

    /* renamed from: A */
    private int f73901A;

    /* renamed from: b */
    private final boolean f73902b;

    /* renamed from: c */
    private final String f73903c;

    /* renamed from: d */
    private final String f73904d;

    /* renamed from: e */
    private final int f73905e;

    /* renamed from: f */
    private final aloa f73906f;

    /* renamed from: g */
    private bmza f73907g;

    /* renamed from: s */
    private final boolean f73908s;

    /* renamed from: t */
    private final boolean f73909t;

    /* renamed from: u */
    private final boolean f73910u;

    /* renamed from: v */
    private final boolean f73911v;

    /* renamed from: w */
    private final boolean f73912w;

    /* renamed from: x */
    private boolean f73913x;

    /* renamed from: z */
    private int f73914z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public alob(String str, int i, alzm alzm, boolean z, boolean z2, String str2, String str3, int i2) {
        super(str, i, alzm, str2, "LoadOwners");
        if (aloa.f73895a == null) {
            aloa.f73895a = new aloa();
        }
        aloa aloa = aloa.f73895a;
        this.f73914z = 1;
        this.f73901A = 1;
        amig.m62939a();
        this.f73902b = z;
        this.f73913x = z2;
        this.f73903c = str2;
        this.f73904d = str3;
        this.f73905e = i2;
        this.f73906f = aloa;
        amig.m62939a();
        this.f73910u = ((Boolean) amgp.f74892a.mo41191a()).booleanValue();
        boolean booleanValue = ((Boolean) amgq.f74893a.mo41191a()).booleanValue();
        this.f73911v = booleanValue;
        aloa.f73898d = booleanValue;
        this.f73909t = ((Boolean) amgo.f74891a.mo41191a()).booleanValue();
        this.f73908s = Boolean.valueOf(cgbe.f186279a.mo6606a().mo83314ar()).booleanValue();
        this.f73912w = ((Boolean) amgn.f74890a.mo41191a()).booleanValue();
        if (this.f73908s) {
            bmza bmza = this.f73907g;
            this.f73907g = bmza == null ? bmza.m108659b(bmvy.f131119a) : bmza;
        }
    }

    /* renamed from: a */
    private final DataHolder m61411a(Context context, boolean z, String str, String str2, int i) {
        DataHolder dataHolder;
        String str3;
        String str4;
        Context context2 = context;
        int i2 = i;
        long a = this.f73908s ? this.f73907g.mo66928a(TimeUnit.MICROSECONDS) : 0;
        aloa aloa = this.f73906f;
        Bundle bundle = new Bundle();
        amea a2 = amea.m62724a(context);
        Bundle bundle2 = new Bundle();
        bnrd a3 = aloa.f73896b.mo41680d(context2).iterator();
        while (a3.hasNext()) {
            Account account = (Account) a3.next();
            if (aloa.f73898d) {
                aloa.f73899e.add(account.name);
            }
            AccountMetadata accountMetadata = new AccountMetadata();
            if (!cgaj.f186240a.mo6606a().mo83189a()) {
                accountMetadata.f81935a = aloa.f73897c.mo41687a(context2, account);
            }
            accountMetadata.f81936b = a2.mo41146b(account.name, (String) null);
            accountMetadata.f81937c = a2.mo41149c(account.name, "pageid");
            accountMetadata.f81938d = a2.mo41146b(account.name, "pageid");
            bundle2.putParcelable(account.name, accountMetadata);
        }
        bundle.putParcelable("account_metadata", bundle2);
        alto b = altq.m61806a(context).mo40763b();
        if (b == null) {
            dataHolder = DataHolder.m22537a(new String[0]).mo25163a(13);
        } else {
            if (i2 == 0) {
                StringBuilder sb = new StringBuilder(70);
                sb.append("account_name,(page_gaia_id IS NOT NULL),display_name COLLATE LOCALIZED");
                str3 = sb.toString();
            } else if (i2 == 1) {
                StringBuilder sb2 = new StringBuilder((int) MfiClientException.TYPE_MFICLIENT_NOT_FOUND);
                sb2.append("(SELECT _id FROM owners WHERE account_name=leftOwners.account_name AND page_gaia_id IS NULL) ,(page_gaia_id IS NOT NULL),display_name COLLATE LOCALIZED");
                str3 = sb2.toString();
            } else {
                StringBuilder sb3 = new StringBuilder(53);
                sb3.append("Value of sortOrder isn't valid.sortOrder= ");
                sb3.append(i2);
                throw new IllegalArgumentException(sb3.toString());
            }
            String valueOf = String.valueOf(str3);
            String str5 = valueOf.length() == 0 ? new String("SELECT _id,account_name,display_name,given_name,family_name,gaia_id,page_gaia_id,avatar,cover_photo_url,cover_photo_height,cover_photo_width,cover_photo_id,last_sync_start_time,last_sync_finish_time,last_sync_status,last_successful_sync_time,sync_circles_to_contacts as sync_to_contacts,sync_circles_to_contacts,sync_evergreen_to_contacts,sync_me_to_contacts,is_dasher,dasher_domain FROM owners leftOwners  WHERE ((?2='') OR (account_name=?2 AND (((?3 = '') AND (page_gaia_id IS NULL)) OR (?3=page_gaia_id)))) AND ( ?1 OR (page_gaia_id IS NULL)) ORDER BY ") : "SELECT _id,account_name,display_name,given_name,family_name,gaia_id,page_gaia_id,avatar,cover_photo_url,cover_photo_height,cover_photo_width,cover_photo_id,last_sync_start_time,last_sync_finish_time,last_sync_status,last_successful_sync_time,sync_circles_to_contacts as sync_to_contacts,sync_circles_to_contacts,sync_evergreen_to_contacts,sync_me_to_contacts,is_dasher,dasher_domain FROM owners leftOwners  WHERE ((?2='') OR (account_name=?2 AND (((?3 = '') AND (page_gaia_id IS NULL)) OR (?3=page_gaia_id)))) AND ( ?1 OR (page_gaia_id IS NULL)) ORDER BY ".concat(valueOf);
            String[] strArr = new String[3];
            if (!z) {
                str4 = "0";
            } else {
                str4 = "1";
            }
            strArr[0] = str4;
            strArr[1] = ancm.m64011b(str);
            strArr[2] = ancm.m64011b(str2);
            dataHolder = new DataHolder(b.mo40744a(str5, strArr), bundle);
        }
        if (this.f73908s) {
            this.f73822a.mo40509a(almk.m61269b(3, this.f73907g.mo66928a(TimeUnit.MICROSECONDS) - a));
        }
        if (dataHolder.f30168h != 0) {
            if (this.f73909t) {
                this.f73914z = 4;
            }
            ArrayList arrayList = new ArrayList();
            int i3 = dataHolder.f30168h;
            bqgj a4 = bqgs.m112811a((ExecutorService) sne.m35694a(i3, 9));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int a5 = dataHolder.mo17762a(i6);
                String c = dataHolder.mo17769c("account_name", i6, a5);
                String c2 = dataHolder.mo17769c("gaia_id", i6, a5);
                if (this.f73911v) {
                    f73900y.add(c);
                }
                if (m61412a(c2, c)) {
                    arrayList.add(a4.mo25819b(new alnz(c, context2)));
                }
                if (this.f73910u) {
                    if (!TextUtils.isEmpty(dataHolder.mo17769c("avatar", i6, a5))) {
                        i4++;
                    }
                    if (!TextUtils.isEmpty(dataHolder.mo17769c("cover_photo_url", i6, a5))) {
                        i5++;
                    }
                }
            }
            if (this.f73910u) {
                almh almh = this.f73822a;
                almh.f73697k = i4;
                almh.f73698l = i5;
            }
            HashMap hashMap = new HashMap();
            try {
                for (C1240of ofVar : (List) bqga.m112774a((Iterable) arrayList).get()) {
                    hashMap.put((String) ofVar.f26798a, (String) ofVar.f26799b);
                }
                if (this.f73909t) {
                    this.f73901A = 2;
                }
            } catch (Exception e) {
                if (this.f73909t) {
                    this.f73901A = 3;
                }
                Log.e("BasePeopleOperation", "Failed to query account Id: ", e);
                if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83361bl()).booleanValue()) {
                    ande.f76660a.mo41719a(context2).mo41718a(e, Double.valueOf(cgbe.f186279a.mo6606a().mo83362bm()).doubleValue());
                }
            }
            int i7 = dataHolder.f30168h;
            amig.m62939a();
            boolean booleanValue = ((Boolean) amgm.f74889a.mo41191a()).booleanValue();
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                int a6 = dataHolder.mo17762a(i10);
                String c3 = dataHolder.mo17769c("account_name", i10, a6);
                if (m61412a(dataHolder.mo17769c("gaia_id", i10, a6), c3)) {
                    if (booleanValue) {
                        i8++;
                    }
                    if (hashMap.containsKey(c3)) {
                        dataHolder.mo17765a("gaia_id", i10);
                        dataHolder.f30164d[a6].putString((String) hashMap.get(c3), i10, dataHolder.f30163c.getInt("gaia_id"));
                        if (booleanValue) {
                            i9++;
                        }
                    }
                }
            }
            if (booleanValue) {
                almh almh2 = this.f73822a;
                almh2.f73699m = i8;
                almh2.f73700n = i9;
            }
        } else if (this.f73909t) {
            this.f73914z = 3;
        }
        if (this.f73909t) {
            almh almh3 = this.f73822a;
            int i11 = this.f73901A;
            int i12 = this.f73914z;
            almh3.f73705s = i11;
            almh3.f73706t = i12;
        }
        if (this.f73908s) {
            this.f73822a.mo40509a(almk.m61269b(2, this.f73907g.mo66928a(TimeUnit.MICROSECONDS)));
            this.f73907g.mo66931e();
        }
        if (this.f73911v) {
            Set set = this.f73906f.f73899e;
            int size = set.size();
            HashSet hashSet = new HashSet(set);
            HashSet hashSet2 = new HashSet(f73900y);
            hashSet2.addAll(set);
            hashSet.retainAll(f73900y);
            hashSet2.removeAll(hashSet);
            almh almh4 = this.f73822a;
            int size2 = hashSet2.size();
            almh4.f73701o = size;
            almh4.f73702p = size2;
        }
        return dataHolder;
    }

    /* renamed from: d */
    public final DataHolder mo40606d(Context context) {
        DataHolder dataHolder;
        int i;
        amig.m62939a();
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83291aU()).booleanValue()) {
            this.f73913x = false;
        }
        if (this.f73902b) {
            dataHolder = m61411a(context, this.f73913x, this.f73903c, this.f73904d, this.f73905e);
        } else {
            dataHolder = m61411a(context, this.f73913x, null, null, this.f73905e);
        }
        amig.m62939a();
        int i2 = 3;
        if (((Boolean) amgu.f74897a.mo41191a()).booleanValue()) {
            almh almh = this.f73822a;
            if (!this.f73913x) {
                i = 3;
            } else {
                i = 2;
            }
            almh.f73708v = i;
        }
        if (this.f73912w) {
            almh almh2 = this.f73822a;
            if (this.f73902b) {
                i2 = 2;
            }
            almh2.f73709w = i2;
        }
        amig.m62939a();
        if (Boolean.valueOf(cgbe.f186279a.mo6606a().mo83290aT()).booleanValue()) {
            int i3 = dataHolder.f30168h;
            for (int i4 = 0; i4 < i3; i4++) {
                int a = dataHolder.mo17762a(i4);
                dataHolder.mo17765a("is_dasher", i4);
                dataHolder.f30164d[a].putLong(0, i4, dataHolder.f30163c.getInt("is_dasher"));
            }
        }
        return dataHolder;
    }

    /* renamed from: a */
    private static boolean m61412a(String str, String str2) {
        return str == null && !TextUtils.isEmpty(str2);
    }
}

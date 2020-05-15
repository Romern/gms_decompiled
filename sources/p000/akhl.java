package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.felicanetworks.sdu.ErrorInfo;
import com.google.android.gms.common.internal.ClientContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: akhl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akhl {

    /* renamed from: a */
    public final akhj f72001a;

    /* renamed from: b */
    public final ajvq f72002b;

    /* renamed from: c */
    public final ajvg f72003c;

    /* renamed from: d */
    public boolean f72004d = false;

    /* renamed from: e */
    private final Context f72005e;

    /* renamed from: f */
    private final List f72006f = new ArrayList();

    /* renamed from: g */
    private final ajvq f72007g;

    /* renamed from: h */
    private final ajvq f72008h;

    /* renamed from: i */
    private final ajvq f72009i;

    /* renamed from: j */
    private final ajvq f72010j;

    /* renamed from: k */
    private final akbu f72011k;

    /* renamed from: l */
    private boolean f72012l = false;

    public akhl(Context context, akbu akbu, ajvg ajvg) {
        akhj akhj = new akhj(new shl(context, cfov.f185185a.mo6606a().mo82356bd(), (int) cfov.f185185a.mo6606a().mo82357be(), context.getApplicationInfo().uid, 9732, (byte[]) null));
        this.f72005e = context;
        this.f72011k = akbu;
        this.f72007g = new ajvq("uploadContacts");
        this.f72008h = new ajvq("uploadPublicCertificates");
        this.f72009i = new ajvq("downloadPublicCertificates");
        this.f72010j = new ajvq("updateDeviceName");
        this.f72002b = new ajvq("checkContactsReachability");
        this.f72001a = akhj;
        this.f72003c = ajvg;
    }

    /* renamed from: a */
    public static int m59710a(Exception exc) {
        if (!(exc instanceof chuw)) {
            return exc instanceof gid ? 9 : 3;
        }
        chus chus = chus.OK;
        int ordinal = ((chuw) exc).f189236a.f189233s.ordinal();
        if (ordinal == 4) {
            return 5;
        }
        if (ordinal == 7) {
            return 6;
        }
        if (ordinal != 14) {
            return ordinal != 16 ? 4 : 8;
        }
        return 7;
    }

    /* renamed from: b */
    public final bvjy mo39453b(Account account, ajih ajih) {
        if (this.f72004d) {
            srn srn = ajvp.f71371a;
            return null;
        } else if (account == null) {
            srn srn2 = ajvp.f71371a;
            return null;
        } else if (ajih.f70709a.size() == 0) {
            srn srn3 = ajvp.f71371a;
            return null;
        } else if (this.f72002b.mo38977a(cfov.f185185a.mo6606a().mo82397u(), cfov.f185185a.mo6606a().mo82398v())) {
            return null;
        } else {
            this.f72002b.mo38976a();
            bvjt bvjt = (bvjt) bvjw.f156359b.mo74144da();
            bxwc bxwc = ajih.f70709a;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                ajif ajif = (ajif) bxwc.get(i);
                bvju bvju = (bvju) bvjv.f156354d.mo74144da();
                ajii ajii = ajif.f70697b;
                if (ajii == null) {
                    ajii = ajii.f70710d;
                }
                String str = ajii.f70714c;
                if (bvju.f164950c) {
                    bvju.mo74035c();
                    bvju.f164950c = false;
                }
                str.getClass();
                ((bvjv) bvju.f164949b).f156356a = str;
                bvju.mo73376a(ajif.f70700e);
                bvju.mo73377b(ajif.f70701f);
                bvjt.mo73375a(bvju);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                akhj akhj = this.f72001a;
                ClientContext c = mo39456c(account);
                bvjw bvjw = (bvjw) bvjt.mo74062i();
                if (akhj.f71994b == null) {
                    akhj.f71994b = chtv.m149566a(chtu.UNARY, "location.nearby.sharing.v1.NearbySharingService/CheckContactsReachability", ciie.m150370a(bvjw.f156359b), ciie.m150370a(bvjy.f156367b));
                }
                bvjy bvjy = (bvjy) akhj.f71997a.mo25553a(akhj.f71994b, c, bvjw, 10000, TimeUnit.MILLISECONDS);
                this.f72003c.mo38958a(ajvh.m59103a(4, 2, SystemClock.elapsedRealtime() - elapsedRealtime));
                srn srn4 = ajvp.f71371a;
                return bvjy;
            } catch (chuw | gid e) {
                this.f72003c.mo38958a(ajvh.m59103a(4, m59710a(e), SystemClock.elapsedRealtime() - elapsedRealtime));
                bnsl bnsl = (bnsl) ajvp.f71371a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("akhl", "b", 558, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("'checkContactsReachability' failed.");
                return null;
            }
        }
    }

    /* renamed from: c */
    public final ClientContext mo39456c(Account account) {
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = Process.myUid();
        clientContext.f30213c = account;
        clientContext.f30215e = this.f72005e.getPackageName();
        clientContext.f30216f = this.f72005e.getPackageName();
        clientContext.mo17806d(cfov.f185185a.mo6606a().mo82383g());
        return clientContext;
    }

    /* renamed from: a */
    public final synchronized void mo39448a() {
        this.f72006f.clear();
        this.f72001a.f71997a.mo25558b();
        this.f72004d = true;
    }

    /* renamed from: a */
    public final synchronized void mo39449a(akdx akdx) {
        this.f72006f.add(akdx);
    }

    /* renamed from: a */
    public final synchronized boolean mo39450a(Account account) {
        if (this.f72004d) {
            srn srn = ajvp.f71371a;
            return false;
        } else if (!this.f72012l) {
            String f = this.f72011k.mo39177f();
            if (TextUtils.isEmpty(f)) {
                srn srn2 = ajvp.f71371a;
                return false;
            } else if (this.f72010j.mo38977a(cfov.f185185a.mo6606a().mo82375bw(), cfov.f185185a.mo6606a().mo82376bx())) {
                return false;
            } else {
                this.f72010j.mo38976a();
                bxvd da = bvkf.f156404c.mo74144da();
                bxuv bxuv = (bxuv) bxuw.f164878b.mo74144da();
                bxuv.mo73906a("display_name");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxuw bxuw = (bxuw) bxuv.mo74062i();
                bxuw.getClass();
                ((bvkf) da.f164949b).f156407b = bxuw;
                bxvd da2 = bvkd.f156387e.mo74144da();
                String valueOf = String.valueOf(this.f72011k.mo39167a());
                String str = valueOf.length() == 0 ? new String("users/me/devices/") : "users/me/devices/".concat(valueOf);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bvkd bvkd = (bvkd) da2.f164949b;
                str.getClass();
                bvkd.f156389a = str;
                f.getClass();
                bvkd.f156390b = f;
                bvkd bvkd2 = (bvkd) da2.mo74062i();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvkd2.getClass();
                    ((bvkf) da.f164949b).f156406a = bvkd2;
                    bvkg a = this.f72001a.mo39447a(mo39456c(account), (bvkf) da.mo74062i());
                    for (akdx akdx : this.f72006f) {
                        akdx.mo39304a(a);
                    }
                    this.f72003c.mo38958a(ajvh.m59103a(6, 2, SystemClock.elapsedRealtime() - elapsedRealtime));
                    srn srn3 = ajvp.f71371a;
                    return true;
                } catch (chuw | gid e) {
                    this.f72003c.mo38958a(ajvh.m59103a(6, m59710a(e), SystemClock.elapsedRealtime() - elapsedRealtime));
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("akhl", "a", (int) ErrorInfo.TYPE_ACTIVATE_FELICA_HTTP_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("'updateDeviceName' failed.");
                    return true;
                }
            }
        } else {
            srn srn4 = ajvp.f71371a;
            return false;
        }
    }

    /* renamed from: b */
    public final synchronized List mo39454b(Account account) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            if (this.f72004d) {
                srn srn = ajvp.f71371a;
                return arrayList;
            } else if (this.f72012l) {
                srn srn2 = ajvp.f71371a;
                return arrayList;
            } else if (account == null) {
                srn srn3 = ajvp.f71371a;
                return arrayList;
            } else if (this.f72009i.mo38977a(cfov.f185185a.mo6606a().mo82281Q(), cfov.f185185a.mo6606a().mo82282R())) {
                return arrayList;
            } else {
                this.f72009i.mo38976a();
                int i = 1;
                String format = String.format("users/me/devices/%s", this.f72011k.mo39167a());
                long as = cfov.f185185a.mo6606a().mo82336as();
                bxvd da = bvjz.f156370d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvjz bvjz = (bvjz) da.f164949b;
                format.getClass();
                bvjz.f156372a = format;
                bvjz.f156373b = (int) as;
                bvjz bvjz2 = (bvjz) da.mo74062i();
                String str = "0";
                long elapsedRealtime = SystemClock.elapsedRealtime();
                while (!TextUtils.isEmpty(str)) {
                    try {
                        try {
                            int parseInt = Integer.parseInt(str);
                            akhj akhj = this.f72001a;
                            ClientContext c = mo39456c(account);
                            bxvd bxvd = (bxvd) bvjz2.mo74142c(5);
                            bxvd.mo73625a((GeneratedMessageLite) bvjz2);
                            String num = Integer.toString(parseInt);
                            if (bxvd.f164950c) {
                                bxvd.mo74035c();
                                bxvd.f164950c = false;
                            }
                            num.getClass();
                            ((bvjz) bxvd.f164949b).f156374c = num;
                            bvjz bvjz3 = (bvjz) bxvd.mo74062i();
                            if (akhj.f71995c == null) {
                                akhj.f71995c = chtv.m149566a(chtu.UNARY, "location.nearby.sharing.v1.NearbySharingService/ListPublicCertificates", ciie.m150370a(bvjz.f156370d), ciie.m150370a(bvka.f156375c));
                            }
                            bvka bvka = (bvka) akhj.f71997a.mo25553a(akhj.f71995c, c, bvjz3, 10000, TimeUnit.MILLISECONDS);
                            for (bvke bvke : bvka.f156378b) {
                                bxvd da2 = ajhl.f70656i.mo74144da();
                                ByteString bxtx = bvke.f156395a;
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                ajhl ajhl = (ajhl) da2.f164949b;
                                bxtx.getClass();
                                int i2 = ajhl.f70658a | i;
                                ajhl.f70658a = i2;
                                ajhl.f70659b = bxtx;
                                ByteString bxtx2 = bvke.f156396b;
                                bxtx2.getClass();
                                int i3 = i2 | 2;
                                ajhl.f70658a = i3;
                                ajhl.f70660c = bxtx2;
                                ByteString bxtx3 = bvke.f156397c;
                                bxtx3.getClass();
                                ajhl.f70658a = i3 | 4;
                                ajhl.f70661d = bxtx3;
                                bxyk bxyk = bvke.f156398d;
                                if (bxyk == null) {
                                    bxyk = bxyk.f165095c;
                                }
                                long a = bxzt.m124578a(bxyk);
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                ajhl ajhl2 = (ajhl) da2.f164949b;
                                ajhl2.f70658a |= 8;
                                ajhl2.f70662e = a;
                                bxyk bxyk2 = bvke.f156399e;
                                if (bxyk2 == null) {
                                    bxyk2 = bxyk.f165095c;
                                }
                                long a2 = bxzt.m124578a(bxyk2);
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                ajhl ajhl3 = (ajhl) da2.f164949b;
                                int i4 = ajhl3.f70658a | 16;
                                ajhl3.f70658a = i4;
                                ajhl3.f70663f = a2;
                                ByteString bxtx4 = bvke.f156402h;
                                bxtx4.getClass();
                                int i5 = i4 | 32;
                                ajhl3.f70658a = i5;
                                ajhl3.f70664g = bxtx4;
                                ByteString bxtx5 = bvke.f156403i;
                                bxtx5.getClass();
                                ajhl3.f70658a = i5 | 64;
                                ajhl3.f70665h = bxtx5;
                                arrayList.add((ajhl) da2.mo74062i());
                                i = 1;
                            }
                            str = bvka.f156377a;
                            srn srn4 = ajvp.f71371a;
                            i = 1;
                        } catch (NumberFormatException e) {
                        }
                    } catch (chuw | gid e2) {
                        this.f72003c.mo38958a(ajvh.m59103a(3, m59710a(e2), SystemClock.elapsedRealtime() - elapsedRealtime));
                        bnsl bnsl = (bnsl) ajvp.f71371a.mo68387b();
                        bnsl.mo68437a(e2);
                        bnsl.mo68432a("akhl", "b", 482, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68420a("'downloadPublicCertificates' failed for parent: %s.", format);
                    }
                }
                this.f72003c.mo38958a(ajvh.m59103a(3, 2, SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized boolean mo39451a(Account account, ajih ajih) {
        int i;
        bxwc bxwc;
        int i2;
        bxwc bxwc2;
        Account account2 = account;
        synchronized (this) {
            if (this.f72004d) {
                srn srn = ajvp.f71371a;
                return false;
            } else if (this.f72012l) {
                srn srn2 = ajvp.f71371a;
                return false;
            } else if (account2 != null) {
                String f = this.f72011k.mo39177f();
                if (TextUtils.isEmpty(f)) {
                    srn srn3 = ajvp.f71371a;
                    return false;
                } else if (this.f72007g.mo38977a(cfov.f185185a.mo6606a().mo82378bz(), cfov.f185185a.mo6606a().mo82345bA())) {
                    return false;
                } else {
                    this.f72007g.mo38976a();
                    bxvd da = bvkf.f156404c.mo74144da();
                    bxuv bxuv = (bxuv) bxuw.f164878b.mo74144da();
                    bxuv.mo73906a("display_name");
                    bxuv.mo73906a("contacts");
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bxuw bxuw = (bxuw) bxuv.mo74062i();
                    bxuw.getClass();
                    ((bvkf) da.f164949b).f156407b = bxuw;
                    bxvd da2 = bvkd.f156387e.mo74144da();
                    String valueOf = String.valueOf(this.f72011k.mo39167a());
                    String str = valueOf.length() == 0 ? new String("users/me/devices/") : "users/me/devices/".concat(valueOf);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvkd bvkd = (bvkd) da2.f164949b;
                    str.getClass();
                    bvkd.f156389a = str;
                    f.getClass();
                    bvkd.f156390b = f;
                    C1223np npVar = new C1223np();
                    bxwc bxwc3 = ajih.f70709a;
                    int size = bxwc3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        ajif ajif = (ajif) bxwc3.get(i3);
                        if (ajif.f70703h) {
                            boolean z = ajif.f70702g;
                            bxwc bxwc4 = ajif.f70700e;
                            int size2 = bxwc4.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                String str2 = (String) bxwc4.get(i4);
                                bvkc bvkc = (bvkc) npVar.get(str2);
                                if (bvkc != null) {
                                    if (bvkc.f156386b) {
                                        bxwc2 = bxwc3;
                                        i2 = size;
                                        i4++;
                                        bxwc3 = bxwc2;
                                        size = i2;
                                    }
                                }
                                bxvd da3 = bvkc.f156383c.mo74144da();
                                bxvd da4 = bvkb.f156379c.mo74144da();
                                bxwc2 = bxwc3;
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bvkb bvkb = (bvkb) da4.f164949b;
                                str2.getClass();
                                i2 = size;
                                bvkb.f156381a = 3;
                                bvkb.f156382b = str2;
                                bvkb bvkb2 = (bvkb) da4.mo74062i();
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bvkc bvkc2 = (bvkc) da3.f164949b;
                                bvkb2.getClass();
                                bvkc2.f156385a = bvkb2;
                                bvkc2.f156386b = z;
                                npVar.put(str2, (bvkc) da3.mo74062i());
                                i4++;
                                bxwc3 = bxwc2;
                                size = i2;
                            }
                            bxwc = bxwc3;
                            i = size;
                            bxwc bxwc5 = ajif.f70701f;
                            int size3 = bxwc5.size();
                            for (int i5 = 0; i5 < size3; i5++) {
                                String str3 = (String) bxwc5.get(i5);
                                bvkc bvkc3 = (bvkc) npVar.get(str3);
                                if (bvkc3 != null) {
                                    if (bvkc3.f156386b) {
                                    }
                                }
                                bxvd da5 = bvkc.f156383c.mo74144da();
                                bxvd da6 = bvkb.f156379c.mo74144da();
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bvkb bvkb3 = (bvkb) da6.f164949b;
                                str3.getClass();
                                bvkb3.f156381a = 2;
                                bvkb3.f156382b = str3;
                                bvkb bvkb4 = (bvkb) da6.mo74062i();
                                if (da5.f164950c) {
                                    da5.mo74035c();
                                    da5.f164950c = false;
                                }
                                bvkc bvkc4 = (bvkc) da5.f164949b;
                                bvkb4.getClass();
                                bvkc4.f156385a = bvkb4;
                                bvkc4.f156386b = z;
                                npVar.put(str3, (bvkc) da5.mo74062i());
                            }
                        } else {
                            bxwc = bxwc3;
                            i = size;
                        }
                        i3++;
                        bxwc3 = bxwc;
                        size = i;
                    }
                    if (ajvh.m59100a() != 2) {
                        bxvd da7 = bvkc.f156383c.mo74144da();
                        bxvd da8 = bvkb.f156379c.mo74144da();
                        String str4 = account2.name;
                        if (da8.f164950c) {
                            da8.mo74035c();
                            da8.f164950c = false;
                        }
                        bvkb bvkb5 = (bvkb) da8.f164949b;
                        str4.getClass();
                        bvkb5.f156381a = 3;
                        bvkb5.f156382b = str4;
                        bvkb bvkb6 = (bvkb) da8.mo74062i();
                        if (da7.f164950c) {
                            da7.mo74035c();
                            da7.f164950c = false;
                        }
                        bvkc bvkc5 = (bvkc) da7.f164949b;
                        bvkb6.getClass();
                        bvkc5.f156385a = bvkb6;
                        bvkc5.f156386b = true;
                        bvkc bvkc6 = (bvkc) da7.mo74062i();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bvkd bvkd2 = (bvkd) da2.f164949b;
                        bvkc6.getClass();
                        bvkd2.mo73378a();
                        bvkd2.f156391c.add(bvkc6);
                    }
                    ArrayList arrayList = new ArrayList(npVar.values());
                    List subList = arrayList.subList(0, Math.min((int) cfov.f185185a.mo6606a().mo82377by(), arrayList.size()));
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvkd bvkd3 = (bvkd) da2.f164949b;
                    bvkd3.mo73378a();
                    bxsy.m123078a(subList, bvkd3.f156391c);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    try {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bvkd bvkd4 = (bvkd) da2.mo74062i();
                        bvkd4.getClass();
                        ((bvkf) da.f164949b).f156406a = bvkd4;
                        bvkg a = this.f72001a.mo39447a(mo39456c(account), (bvkf) da.mo74062i());
                        for (akdx akdx : this.f72006f) {
                            akdx.mo39304a(a);
                        }
                        this.f72003c.mo38958a(ajvh.m59103a(5, 2, SystemClock.elapsedRealtime() - elapsedRealtime));
                        srn srn4 = ajvp.f71371a;
                        return true;
                    } catch (chuw | gid e) {
                        this.f72003c.mo38958a(ajvh.m59103a(5, m59710a(e), SystemClock.elapsedRealtime() - elapsedRealtime));
                        bnsl bnsl = (bnsl) ajvp.f71371a.mo68387b();
                        bnsl.mo68437a(e);
                        bnsl.mo68432a("akhl", "a", 324, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68405a("'uploadContacts' failed.");
                        return false;
                    }
                }
            } else {
                srn srn5 = ajvp.f71371a;
                return false;
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo39455b() {
        this.f72006f.clear();
        this.f72012l = true;
    }

    /* renamed from: a */
    public final synchronized boolean mo39452a(Account account, List list) {
        if (this.f72004d) {
            srn srn = ajvp.f71371a;
            return false;
        } else if (this.f72012l) {
            srn srn2 = ajvp.f71371a;
            return false;
        } else if (account != null) {
            String f = this.f72011k.mo39177f();
            if (TextUtils.isEmpty(f)) {
                srn srn3 = ajvp.f71371a;
                return false;
            } else if (this.f72008h.mo38977a(cfov.f185185a.mo6606a().mo82346bB(), cfov.f185185a.mo6606a().mo82347bC())) {
                return false;
            } else {
                this.f72008h.mo38976a();
                bxvd da = bvkf.f156404c.mo74144da();
                bxuv bxuv = (bxuv) bxuw.f164878b.mo74144da();
                bxuv.mo73906a("display_name");
                bxuv.mo73906a("public_certificates");
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxuw bxuw = (bxuw) bxuv.mo74062i();
                bxuw.getClass();
                ((bvkf) da.f164949b).f156407b = bxuw;
                bxvd da2 = bvkd.f156387e.mo74144da();
                String valueOf = String.valueOf(this.f72011k.mo39167a());
                String str = valueOf.length() == 0 ? new String("users/me/devices/") : "users/me/devices/".concat(valueOf);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bvkd bvkd = (bvkd) da2.f164949b;
                str.getClass();
                bvkd.f156389a = str;
                f.getClass();
                bvkd.f156390b = f;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    akhk akhk = (akhk) it.next();
                    ajhl ajhl = akhk.f71998a;
                    bxvd da3 = bvke.f156393j.mo74144da();
                    ByteString bxtx = ajhl.f70659b;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bvke bvke = (bvke) da3.f164949b;
                    bxtx.getClass();
                    bvke.f156395a = bxtx;
                    ByteString bxtx2 = ajhl.f70661d;
                    bxtx2.getClass();
                    bvke.f156397c = bxtx2;
                    ByteString bxtx3 = ajhl.f70660c;
                    bxtx3.getClass();
                    bvke.f156396b = bxtx3;
                    bxvd da4 = bxyk.f165095c.mo74144da();
                    long j = ajhl.f70662e / 1000;
                    if (da4.f164950c) {
                        da4.mo74035c();
                        da4.f164950c = false;
                    }
                    ((bxyk) da4.f164949b).f165097a = j;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bxyk bxyk = (bxyk) da4.mo74062i();
                    bxyk.getClass();
                    ((bvke) da3.f164949b).f156398d = bxyk;
                    bxvd da5 = bxyk.f165095c.mo74144da();
                    long j2 = ajhl.f70663f / 1000;
                    if (da5.f164950c) {
                        da5.mo74035c();
                        da5.f164950c = false;
                    }
                    ((bxyk) da5.f164949b).f165097a = j2;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bxyk bxyk2 = (bxyk) da5.mo74062i();
                    bxyk2.getClass();
                    ((bvke) da3.f164949b).f156399e = bxyk2;
                    ByteString bxtx4 = akhk.f71999b;
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    bvke bvke2 = (bvke) da3.f164949b;
                    bxtx4.getClass();
                    bvke2.f156401g = bxtx4;
                    ByteString bxtx5 = ajhl.f70664g;
                    bxtx5.getClass();
                    bvke2.f156402h = bxtx5;
                    bvke2.f156400f = akhk.f72000c;
                    ByteString bxtx6 = ajhl.f70665h;
                    bxtx6.getClass();
                    bvke2.f156403i = bxtx6;
                    bvke bvke3 = (bvke) da3.mo74062i();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bvkd bvkd2 = (bvkd) da2.f164949b;
                    bvke3.getClass();
                    if (!bvkd2.f156392d.mo73666a()) {
                        bvkd2.f156392d = GeneratedMessageLite.m124021a(bvkd2.f156392d);
                    }
                    bvkd2.f156392d.add(bvke3);
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bvkd bvkd3 = (bvkd) da2.mo74062i();
                    bvkd3.getClass();
                    ((bvkf) da.f164949b).f156406a = bvkd3;
                    bvkg a = this.f72001a.mo39447a(mo39456c(account), (bvkf) da.mo74062i());
                    for (akdx akdx : this.f72006f) {
                        akdx.mo39304a(a);
                    }
                    this.f72003c.mo38958a(ajvh.m59103a(2, 2, SystemClock.elapsedRealtime() - elapsedRealtime));
                    srn srn4 = ajvp.f71371a;
                    return true;
                } catch (chuw | gid e) {
                    this.f72003c.mo38958a(ajvh.m59103a(2, m59710a(e), SystemClock.elapsedRealtime() - elapsedRealtime));
                    bnsl bnsl = (bnsl) ajvp.f71371a.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("akhl", "a", 403, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("'uploadCertificates' failed.");
                    return false;
                }
            }
        } else {
            srn srn5 = ajvp.f71371a;
            return false;
        }
    }
}

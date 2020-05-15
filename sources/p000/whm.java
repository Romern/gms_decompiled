package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.family.invites.Contact;
import com.google.android.gms.family.invites.SendInvitationsResultReceiver;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.firstparty.GetClientTokenRequest;
import com.google.android.gms.wallet.firstparty.WalletCustomTheme;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: whm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class whm extends whz {

    /* renamed from: b */
    private final List f50654b;

    /* renamed from: c */
    private final ResultReceiver f50655c;

    /* renamed from: d */
    private final String f50656d;

    /* renamed from: e */
    private final awkh f50657e;

    /* renamed from: f */
    private final WalletCustomTheme f50658f;

    /* renamed from: g */
    private final wgj f50659g;

    /* renamed from: h */
    private final String f50660h;

    /* renamed from: i */
    private final brcm f50661i;

    /* renamed from: j */
    private final wgh f50662j;

    public whm(Context context, wgh wgh, awkh awkh, WalletCustomTheme walletCustomTheme, wgj wgj, String str, List list, String str2, brcm brcm, ResultReceiver resultReceiver) {
        super(context);
        this.f50654b = list;
        this.f50656d = str;
        this.f50660h = str2;
        this.f50655c = resultReceiver;
        this.f50657e = awkh;
        this.f50658f = walletCustomTheme;
        this.f50659g = wgj;
        this.f50661i = brcm;
        this.f50662j = wgh;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ArrayList mo29105a(List list, String str, String str2) {
        String str3 = str;
        aucb a = this.f50657e.mo52198a(new GetClientTokenRequest(this.f50658f));
        try {
            byte[] bArr = (byte[]) aucu.m76783a(a, 2, TimeUnit.SECONDS);
            bxvd da = brbk.f142272e.mo74144da();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            int size = list.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Contact contact = (Contact) list.get(i);
                int i2 = contact.f31291j;
                if (i2 == 3 || i2 == 4) {
                    bxvd da2 = brdk.f142515l.mo74144da();
                    bxvd da3 = brdm.f142533d.mo74144da();
                    brcm brcm = this.f50661i;
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = z;
                    }
                    brdk brdk = (brdk) da2.f164949b;
                    brdk.f142521e = brcm.f142395g;
                    int i3 = 8 | brdk.f142517a;
                    brdk.f142517a = i3;
                    brdk.f142525i = 1;
                    brdk.f142517a = i3 | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    contact.mo18400c();
                    int c = contact.mo18400c();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = z;
                    }
                    brdk brdk2 = (brdk) da2.f164949b;
                    brdk2.f142526j = c - 1;
                    brdk2.f142517a |= 512;
                    if (str3 != null) {
                        brdk brdk3 = (brdk) da2.f164949b;
                        str.getClass();
                        brdk3.f142517a |= 64;
                        brdk3.f142523g = str3;
                    }
                    bxvd da4 = brci.f142378g.mo74144da();
                    String str4 = contact.f31283b;
                    if (str4 != null) {
                        if (da4.f164950c) {
                            da4.mo74035c();
                            da4.f164950c = z;
                        }
                        brci brci = (brci) da4.f164949b;
                        str4.getClass();
                        brci.f142380a |= 1;
                        brci.f142381b = str4;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    brdk brdk4 = (brdk) da2.f164949b;
                    brci brci2 = (brci) da4.mo74062i();
                    brci2.getClass();
                    brdk4.f142520d = brci2;
                    brdk4.f142517a |= 4;
                    String str5 = contact.f31282a;
                    if (str5 == null) {
                        String str6 = contact.f31284c;
                        if (str6 != null) {
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            brdm brdm = (brdm) da3.f164949b;
                            str6.getClass();
                            brdm.f142535a |= 1;
                            brdm.f142536b = str6;
                        }
                    } else {
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        brdm brdm2 = (brdm) da3.f164949b;
                        str5.getClass();
                        brdm2.f142535a |= 2;
                        brdm2.f142537c = str5;
                    }
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    brdk brdk5 = (brdk) da2.f164949b;
                    brdm brdm3 = (brdm) da3.mo74062i();
                    brdm3.getClass();
                    brdk5.f142519c = brdm3;
                    brdk5.f142517a |= 2;
                    if (str3 != null) {
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        brdk brdk6 = (brdk) da2.f164949b;
                        str.getClass();
                        brdk6.f142517a |= 64;
                        brdk6.f142523g = str3;
                    }
                    String num = Integer.toString(contact.f31285d);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    brdk brdk7 = (brdk) da2.f164949b;
                    num.getClass();
                    brdk7.f142517a |= 1024;
                    brdk7.f142527k = num;
                    hashMap.put(brdk7.f142527k, contact);
                    arrayList.add((brdk) da2.mo74062i());
                }
                i++;
                z = false;
            }
            brak a2 = wgy.m41937a(getContext(), this.f50659g, this.f50662j);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = z;
            }
            brbk brbk = (brbk) da.f164949b;
            a2.getClass();
            brbk.f142275b = a2;
            brbk.f142274a |= 1;
            bxtx a3 = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = z;
            }
            brbk brbk2 = (brbk) da.f164949b;
            a3.getClass();
            brbk2.f142274a |= 2;
            brbk2.f142277d = a3;
            if (!brbk2.f142276c.mo73666a()) {
                brbk2.f142276c = bxvk.m124021a(brbk2.f142276c);
            }
            bxsy.m123078a(arrayList, brbk2.f142276c);
            String valueOf = String.valueOf(da);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Create Invitations Request:");
            sb.append(valueOf);
            sb.toString();
            sbw sbw = wgn.f50624a;
            try {
                wih a4 = whc.m41943a();
                ClientContext a5 = whc.m41942a(str2);
                brbk brbk3 = (brbk) da.mo74062i();
                if (wih.f50719k == null) {
                    wih.f50719k = chtv.m149566a(chtu.UNARY, "google.familymanagement.v1.FamilyManagementService/CreateInvitations", ciie.m150370a(brbk.f142272e), ciie.m150370a(brbl.f142279d));
                }
                brbl brbl = (brbl) a4.f50732a.mo25553a(wih.f50719k, a5, brbk3, (long) wih.f50710b, TimeUnit.MILLISECONDS);
                wgj wgj = this.f50659g;
                bral bral = brbl.f142281a;
                if (bral == null) {
                    bral = bral.f142158c;
                }
                wgy.m41938a(wgj, bral);
                String valueOf2 = String.valueOf(brbl);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                sb2.append("Create Invitations Response:");
                sb2.append(valueOf2);
                sb2.toString();
                ArrayList arrayList2 = new ArrayList();
                bxwc bxwc = brbl.f142282b;
                int size2 = bxwc.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    brdk brdk8 = (brdk) bxwc.get(i4);
                    Contact contact2 = (Contact) hashMap.get(brdk8.f142527k);
                    Contact contact3 = new Contact(contact2);
                    contact3.f31287f = brdk8.f142518b;
                    if (contact2.mo18399b()) {
                        contact3.f31286e = brdk8.f142524h;
                    }
                    String valueOf3 = String.valueOf(contact3);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                    sb3.append("Contact updated:");
                    sb3.append(valueOf3);
                    sb3.toString();
                    arrayList2.add(contact3);
                }
                bxwc bxwc2 = brbl.f142283c;
                int size3 = bxwc2.size();
                for (int i5 = z; i5 < size3; i5++) {
                    Contact contact4 = (Contact) hashMap.get(((brca) bxwc2.get(i5)).f142348a);
                    Contact contact5 = new Contact(contact4);
                    int i6 = contact4.f31291j;
                    if (i6 == 3) {
                        contact5.f31291j = 7;
                    } else if (i6 == 4) {
                        contact5.f31291j = 8;
                    }
                    arrayList2.add(contact5);
                }
                return arrayList2;
            } catch (chuw | gid e) {
                throw new wgx(e.getMessage(), e);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            sbw sbw2 = wgn.f50624a;
            throw new whl(a.toString());
        }
    }

    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        ArrayList arrayList = new ArrayList();
        try {
            return new why(true, mo29105a(this.f50654b, this.f50656d, this.f50660h));
        } catch (wgx | whl e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() == 0) {
                new String("Error creatingInvitations: ");
            } else {
                "Error creatingInvitations: ".concat(valueOf);
            }
            sbw sbw = wgn.f50624a;
            Bundle bundle = new Bundle();
            int i = SendInvitationsResultReceiver.f31334a;
            bundle.putInt("result-code", 2);
            ResultReceiver resultReceiver = this.f50655c;
            if (resultReceiver != null) {
                resultReceiver.send(-1, bundle);
            }
            return new why(false, arrayList);
        }
    }
}

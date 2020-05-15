package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.android.volley.VolleyError;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.udc.SettingState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: avax */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avax extends avau {

    /* renamed from: k */
    private static final srn f92890k = srn.m36124a();

    /* renamed from: l */
    private final List f92891l = new ArrayList();

    public avax(Context context, avdl avdl, ClientContext clientContext, String str, avap avap, byte[] bArr) {
        super(context, avdl, clientContext, str, "CheckConsentOperation", avap, bArr);
    }

    /* renamed from: a */
    private final int m78168a(bxsb bxsb) {
        if (bxsb.f164656c.size() != 0) {
            bxwc bxwc = bxsb.f164656c;
            int size = bxwc.size();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                bxsi bxsi = (bxsi) bxwc.get(i);
                int a = bxsn.m123069a(bxsi.f164685c);
                if (a == 0 || a != 3) {
                    z = false;
                }
                List list = this.f92891l;
                int i2 = bxsi.f164684b;
                int a2 = bxsn.m123069a(bxsi.f164685c);
                if (a2 == 0) {
                    a2 = 1;
                }
                list.add(new SettingState(i2, a2 - 1));
            }
            if (z) {
                return 0;
            }
            if ((bxsb.f164654a & 2) == 0) {
                return 4501;
            }
            bxsa bxsa = bxsb.f164657d;
            if (bxsa == null) {
                bxsa = bxsa.f164648b;
            }
            return bxsa.f164650a ? 4500 : 4501;
        }
        bnsl bnsl = (bnsl) f92890k.mo68387b();
        bnsl.mo68432a("avax", "a", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("retrieved empty setting states list");
        return 4505;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avav.a(int, boolean):void
     arg types: [int, int]
     candidates:
      avau.a(java.lang.String, java.lang.String):boolean
      avav.a(int, boolean):void */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        char c;
        bxrm bxrm;
        super.mo6502a(context);
        bxvd da = bxrt.f164599j.mo74144da();
        try {
            mo51133b();
            da.mo73635b(this.f92880b, bxus.m123744c());
            boolean z = false;
            boolean z2 = false;
            for (Integer num : Collections.unmodifiableList(((bxrt) da.f164949b).f164604d)) {
                if (num.equals(2)) {
                    z2 = true;
                }
                if (num.equals(15)) {
                    z = true;
                }
            }
            if (!(z ^ z2)) {
                bxss bxss = ((bxrt) da.f164949b).f164607g;
                if (bxss == null) {
                    bxss = bxss.f164728i;
                }
                bxvd a = mo51130a(bxss);
                String a2 = m78158a(((bxrt) da.f164949b).f164603c);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxrt bxrt = (bxrt) da.f164949b;
                a2.getClass();
                bxrt.f164601a |= 2;
                bxrt.f164603c = a2;
                bxvd da2 = bsqx.f146703c.mo74144da();
                bxtx a3 = bxtx.m123261a(ggj.m13107a());
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsqx bsqx = (bsqx) da2.f164949b;
                a3.getClass();
                bsqx.f146705a |= 1;
                bsqx.f146706b = a3;
                String encodeToString = Base64.encodeToString(((bsqx) da2.mo74062i()).mo73642k(), 10);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxrt bxrt2 = (bxrt) da.f164949b;
                encodeToString.getClass();
                bxrt2.f164601a |= 32;
                bxrt2.f164609i = encodeToString;
                String str = bxrt2.f164603c;
                List unmodifiableList = Collections.unmodifiableList(bxrt2.f164604d);
                bxry bxry = (bxry) bxrz.f164639h.mo74144da();
                if (bxry.f164950c) {
                    bxry.mo74035c();
                    bxry.f164950c = false;
                }
                bxrz bxrz = (bxrz) bxry.f164949b;
                str.getClass();
                bxrz.f164641a |= 2;
                bxrz.f164643c = str;
                if (!bxrz.f164645e.mo73666a()) {
                    bxrz.f164645e = bxvk.m124019a(bxrz.f164645e);
                }
                bxsy.m123078a(unmodifiableList, bxrz.f164645e);
                boolean isEmpty = unmodifiableList.isEmpty();
                if (bxry.f164950c) {
                    bxry.mo74035c();
                    bxry.f164950c = false;
                }
                bxrz bxrz2 = (bxrz) bxry.f164949b;
                bxrz2.f164641a |= 4;
                bxrz2.f164644d = isEmpty;
                String c2 = mo51134c();
                bxre a4 = aviz.m78598a(this.f92882c, c2);
                if (a4 != null) {
                    if (bxry.f164950c) {
                        bxry.mo74035c();
                        bxry.f164950c = false;
                    }
                    bxrz bxrz3 = (bxrz) bxry.f164949b;
                    a4.getClass();
                    bxrz3.f164642b = a4;
                    bxrz3.f164641a |= 1;
                }
                if (m78159a(((bxrz) bxry.f164949b).f164643c, c2)) {
                    avcc a5 = mo51129a();
                    avcb a6 = a5.mo51137a();
                    if (a6 != null && Status.f30107a.equals(a6.f92942a)) {
                        bxry.mo73616a(a6.f92943b);
                    }
                    bxsr b = a5.mo51141b();
                    if (b != null) {
                        if (a.f164950c) {
                            a.mo74035c();
                            a.f164950c = false;
                        }
                        bxss bxss2 = (bxss) a.f164949b;
                        b.getClass();
                        bxss2.f164737h = b;
                        bxss2.f164730a |= 128;
                    } else {
                        if (a.f164950c) {
                            a.mo74035c();
                            a.f164950c = false;
                        }
                        bxss bxss3 = (bxss) a.f164949b;
                        bxss3.f164737h = null;
                        bxss3.f164730a &= -129;
                    }
                }
                if (bxry.f164950c) {
                    bxry.mo74035c();
                    bxry.f164950c = false;
                }
                bxrz bxrz4 = (bxrz) bxry.f164949b;
                bxss bxss4 = (bxss) a.mo74062i();
                bxss4.getClass();
                bxrz4.f164646f = bxss4;
                bxrz4.f164641a |= 8;
                bxsb a7 = ((avau) this).f92879a.mo51118a(this.f92884e, (bxrz) bxry.mo74062i());
                bxrf bxrf = a7.f164655b;
                if (bxrf == null) {
                    bxrf = bxrf.f164550c;
                }
                aviz.m78599a(bxrf, this.f92882c, c2);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bxrt bxrt3 = (bxrt) da.f164949b;
                bxss bxss5 = (bxss) a.mo74062i();
                bxss5.getClass();
                bxrt3.f164607g = bxss5;
                bxrt3.f164601a |= 16;
                if (a7.f164656c.size() == 0) {
                    bnsl bnsl = (bnsl) f92890k.mo68387b();
                    bnsl.mo68432a("avax", "a", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("retrieved empty setting states list");
                    c = 4505;
                } else {
                    boolean z3 = true;
                    for (bxsi bxsi : a7.f164656c) {
                        int a8 = bxsn.m123069a(bxsi.f164685c);
                        if (a8 == 0 || a8 != 3) {
                            z3 = false;
                        }
                        List list = this.f92891l;
                        int i = bxsi.f164684b;
                        int a9 = bxsn.m123069a(bxsi.f164685c);
                        if (a9 == 0) {
                            a9 = 1;
                        }
                        list.add(new SettingState(i, a9 - 1));
                    }
                    if (!z3) {
                        if ((a7.f164654a & 2) != 0) {
                            bxsa bxsa = a7.f164657d;
                            if (bxsa == null) {
                                bxsa = bxsa.f164648b;
                            }
                            if (bxsa.f164650a) {
                                c = 4500;
                            }
                        }
                        c = 4501;
                    } else {
                        c = 0;
                    }
                }
                if (c == 0) {
                    mo51131a(0);
                    this.f92883d.mo51160a(Status.f30107a, this.f92891l);
                } else if (c == 4500) {
                    mo51132a(4500, true);
                    Context context2 = this.f92882c;
                    String str2 = this.f92885f;
                    bxrt bxrt4 = (bxrt) da.mo74062i();
                    if ((a7.f164654a & 4) != 0) {
                        bxrm = a7.f164658e;
                        if (bxrm == null) {
                            bxrm = bxrm.f164575c;
                        }
                    } else {
                        bxrm = null;
                    }
                    Intent intent = new Intent();
                    intent.setClassName(context2, "com.google.android.gms.udc.ui.UdcConsentActivity");
                    intent.putExtra("UdcAccountName", str2);
                    new Bundle();
                    if (!(bxrm == null || (bxrm.f164577a & 1) == 0)) {
                        bxrl bxrl = bxrm.f164578b;
                        if (bxrl == null) {
                            bxrl = bxrl.f164570d;
                        }
                        avih.m78573a(intent, "UdcLayoutOverwrites", bxrl);
                    }
                    avih.m78573a(intent, "UdcConsentRequest", bxrt4);
                    this.f92883d.mo51160a(new Status(4500, "User consent is required", spn.m35844a(this.f92882c, intent, 134217728)), this.f92891l);
                } else if (c == 4501) {
                    mo51132a(4501, true);
                    this.f92883d.mo51160a(new Status(4501, "Settings unavailable", null), this.f92891l);
                } else {
                    throw new aaaj(4505, null);
                }
            } else {
                throw new avaw("LR and LH must be requested together.ReportingApi only allows a combined optin.");
            }
        } catch (gid e) {
            throw new aaaj(4504, null);
        } catch (VolleyError e2) {
            throw mo51128a(e2);
        } catch (bxwf e3) {
            throw new aaaj(4503, null);
        } catch (IOException e4) {
            throw new aaaj(4505, null);
        } catch (avbp e5) {
            throw new aaaj(10, null);
        } catch (avaw e6) {
            throw new aaaj(10, e6.getMessage());
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        mo51131a(status.f30115i);
        this.f92883d.mo51160a(status, (List) null);
    }
}

package p000;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import android.os.WorkSource;
import android.util.SparseArray;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.beacon.BleFilter;
import com.google.location.nearby.direct.client.internal.OperationRequest;
import com.google.location.nearby.direct.client.internal.OperationResponse;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bved */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bved extends bvaz {

    /* renamed from: a */
    public final SparseArray f155695a = new SparseArray();

    /* renamed from: b */
    public final Handler f155696b;

    /* renamed from: c */
    public final buqh f155697c;

    /* renamed from: d */
    public final ExecutorService f155698d;

    /* renamed from: e */
    public final bvdo f155699e;

    /* renamed from: f */
    public final CountDownLatch f155700f;

    /* renamed from: g */
    public long f155701g;

    /* renamed from: h */
    public final AtomicBoolean f155702h;

    /* renamed from: i */
    public final AtomicBoolean f155703i;

    /* renamed from: j */
    public final buqn f155704j = new bvdz(this, "ShutDownNearbyDirect");

    /* renamed from: k */
    private final Handler.Callback f155705k = new bvdy(this);

    public bved(Context context, Handler handler) {
        this.f155696b = new adzt(handler.getLooper(), this.f155705k);
        this.f155697c = (buqh) ahgz.m55754a(context, buqh.class);
        this.f155698d = adzl.f62962b.mo25874a();
        this.f155699e = new bvdo(context, this.f155698d);
        this.f155700f = new CountDownLatch(1);
        this.f155702h = new AtomicBoolean(false);
        this.f155703i = new AtomicBoolean(false);
    }

    /* renamed from: a */
    private static OperationResponse m121016a(String str, bvac bvac) {
        bxvd da = bvaa.f155448d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvaa bvaa = (bvaa) da.f164949b;
        str.getClass();
        int i = bvaa.f155450a | 1;
        bvaa.f155450a = i;
        bvaa.f155451b = str;
        bvaa.f155452c = bvac.f155464j;
        bvaa.f155450a = i | 2;
        return new OperationResponse((bvaa) da.mo74062i());
    }

    /* renamed from: c */
    private static final Integer m121017c(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /* renamed from: b */
    public final bvct mo73357b(String str) {
        return mo73355a(m121017c(str));
    }

    /* renamed from: d */
    public final boolean mo73271d(OperationRequest operationRequest) {
        bvdo bvdo = this.f155699e;
        bvbb bvbb = operationRequest.f191769b;
        try {
            int a = bvbe.m120864a(bvbb.f155513b);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 2) {
                buzk buzk = bvbb.f155514c;
                if (buzk == null) {
                    buzk = buzk.f155391e;
                }
                if ((buzk.f155393a & 1) != 0) {
                    buzt buzt = buzk.f155394b;
                    if (buzt == null) {
                        buzt = buzt.f155423f;
                    }
                    int a2 = buzz.m120822a(buzt.f155426b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (a2 == 1) {
                        buwc.m120564a(bvdo.f155661b, buzk);
                        return true;
                    }
                    throw new bvdj("WiFi is no longer supported");
                }
                String valueOf = String.valueOf(buzk);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                sb.append("Unrecognized connect request: ");
                sb.append(valueOf);
                throw new bvdj(sb.toString());
            } else if (i == 3) {
                return true;
            } else {
                if (i == 4) {
                    buyq buyq = bvbb.f155516e;
                    if (buyq == null) {
                        buyq = buyq.f155323f;
                    }
                    int a3 = buyt.m120786a(buyq.f155326b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i2 = a3 - 1;
                    if (i2 == 2) {
                        buvw.m120547a(bvdo.f155661b, buyq);
                        return true;
                    } else if (i2 == 3) {
                        buvb.m120493a(bvdo.f155661b, buyq);
                        return true;
                    } else if (i2 != 4) {
                        String valueOf2 = String.valueOf(buyq);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 32);
                        sb2.append("Unrecognized advertise request: ");
                        sb2.append(valueOf2);
                        throw new bvdj(sb2.toString());
                    } else {
                        throw new bvdj("WiFi is no longer supported");
                    }
                } else if (i == 5) {
                    bvad bvad = bvbb.f155517f;
                    if (bvad == null) {
                        bvad = bvad.f155465e;
                    }
                    int a4 = bvak.m120835a(bvad.f155468b);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    int i3 = a4 - 1;
                    if (i3 == 3) {
                        buvy.m120553a(bvdo.f155661b, bvad);
                        return true;
                    } else if (i3 == 4) {
                        buvu.m120536a(bvdo.f155661b, bvad);
                        return true;
                    } else {
                        String valueOf3 = String.valueOf(bvad);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 27);
                        sb3.append("Unrecognized scan request: ");
                        sb3.append(valueOf3);
                        throw new bvdj(sb3.toString());
                    }
                } else if (i == 8) {
                    buym buym = bvbb.f155520i;
                    if (buym == null) {
                        buym = buym.f155312c;
                    }
                    int a5 = buyp.m120782a(buym.f155315b);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    int i4 = a5 - 1;
                    if (i4 == 1) {
                        buwa.m120558a(bvdo.f155661b);
                        return true;
                    } else if (i4 == 2) {
                        buvh.m120501a(bvdo.f155661b);
                        return true;
                    } else {
                        String valueOf4 = String.valueOf(buym);
                        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 29);
                        sb4.append("Unrecognized accept request: ");
                        sb4.append(valueOf4);
                        throw new bvdj(sb4.toString());
                    }
                } else {
                    String valueOf5 = String.valueOf(bvbb);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 22);
                    sb5.append("Unrecognized request: ");
                    sb5.append(valueOf5);
                    throw new bvdj(sb5.toString());
                }
            }
        } catch (bvdj e) {
            srn srn = bvcm.f155598a;
            e.getMessage();
            return false;
        } catch (bvdk e2) {
            srn srn2 = bvcm.f155598a;
            e2.getMessage();
            return false;
        }
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        synchronized (this.f155695a) {
            printWriter.printf("%d operations:\n", Integer.valueOf(this.f155695a.size()));
            String valueOf = String.valueOf(this.f155695a.toString());
            printWriter.println(valueOf.length() == 0 ? new String("  ") : "  ".concat(valueOf));
        }
    }

    /* renamed from: b */
    public final OperationResponse mo73269b(OperationRequest operationRequest) {
        bvdm bvdm;
        bvct bvct;
        bvbb bvbb = operationRequest.f191769b;
        bvbf bvbf = bvbb.f155518g;
        if (bvbf == null) {
            bvbf = bvbf.f155533d;
        }
        String str = bvbf.f155537c;
        Integer c = m121017c(str);
        synchronized (this.f155695a) {
            bvdm = null;
            if (c != null) {
                if (!mo73358b()) {
                    bvct = (bvct) this.f155695a.get(c.intValue());
                }
            }
            bvct = null;
        }
        if (bvct == null) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("bved", "b", (int) BaseMfiEventCallback.TYPE_EXPIRED_MFI, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Invalid operation id specified to update: %s", str);
            return m121016a(str, bvac.OPERATION_STATUS_MISSING);
        }
        srn srn = bvcm.f155598a;
        try {
            if ((bvbb.f155512a & 32) != 0) {
                bvbf bvbf2 = bvbb.f155518g;
                if (bvbf2 == null) {
                    bvbf2 = bvbf.f155533d;
                }
                int a = bvas.m120843a(bvbf2.f155536b);
                if (a != 0 && a == 2 && (bvct instanceof bvdi)) {
                    bvdc bvdc = ((bvdi) bvct).f155649a;
                    if (bvdc instanceof buwc) {
                        bvdm = new bvdm((buwc) bvdc);
                    } else if (bvdc instanceof buvi) {
                        bvdm = new bvdn((buvi) bvdc);
                    }
                }
                if (bvdm == null) {
                    throw new bvdj("Invalid update operation request");
                }
            }
            this.f155696b.obtainMessage(4, bvdm).sendToTarget();
            return m121016a(str, bvac.OPERATION_STATUS_STARTING);
        } catch (bvdj e) {
            bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68388c();
            bnsl2.mo68437a(e);
            bnsl2.mo68432a("bved", "b", (int) BaseMfiEventCallback.TYPE_AGREEMENT_NOT_ACCEPT, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("Unsupported operation request specified to start.");
            return m121016a(str, bvac.OPERATION_STATUS_UPDATE_FAILED);
        }
    }

    /* renamed from: c */
    public final boolean mo73270c(OperationRequest operationRequest) {
        bvbb bvbb = operationRequest.f191769b;
        bvdo bvdo = this.f155699e;
        if ((bvbb.f155512a & 64) == 0) {
            return false;
        }
        bvan bvan = bvbb.f155519h;
        if (bvan == null) {
            bvan = bvan.f155497d;
        }
        int a = bvap.m120840a(bvan.f155500b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            bvbu bvbu = bvdo.f155660a;
            bvan bvan2 = bvbb.f155519h;
            if (bvan2 == null) {
                bvan2 = bvan.f155497d;
            }
            byyg byyg = bvan2.f155501c;
            if (byyg == null) {
                byyg = byyg.f168916p;
            }
            srn srn = bvcm.f155598a;
            bvbu.mo73291b(byyg);
            bvbu.mo73290a(byyg);
            return true;
        } else if (i == 2) {
            bvbu bvbu2 = bvdo.f155660a;
            bvan bvan3 = bvbb.f155519h;
            if (bvan3 == null) {
                bvan3 = bvan.f155497d;
            }
            byyg byyg2 = bvan3.f155501c;
            if (byyg2 == null) {
                byyg2 = byyg.f168916p;
            }
            srn srn2 = bvcm.f155598a;
            bvbu2.mo73291b(byyg2);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            bvbu bvbu3 = bvdo.f155660a;
            srn srn3 = bvcm.f155598a;
            bvbu3.f155567b = bvbu3.f155566a;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        return null;
     */
    /* renamed from: a */
    public final bvct mo73355a(Integer num) {
        synchronized (this.f155695a) {
            if (num != null) {
                if (!mo73358b()) {
                    bvct bvct = (bvct) this.f155695a.get(num.intValue());
                    this.f155695a.delete(num.intValue());
                    return bvct;
                }
            }
        }
    }

    /* renamed from: a */
    public final OperationResponse mo73267a(OperationRequest operationRequest) {
        try {
            bvdo bvdo = this.f155699e;
            bvbb bvbb = operationRequest.f191769b;
            WorkSource workSource = operationRequest.f191771d;
            BleFilter[] bleFilterArr = operationRequest.f191772e;
            int a = bvbe.m120864a(bvbb.f155513b);
            int i = 1;
            if (a == 0) {
                a = 1;
            }
            int i2 = a - 1;
            bvct bvct = null;
            if (i2 != 0) {
                switch (i2) {
                    case 2:
                        buzk buzk = bvbb.f155514c;
                        if (buzk == null) {
                            buzk = buzk.f155391e;
                        }
                        if ((buzk.f155393a & 1) != 0) {
                            buzt buzt = buzk.f155394b;
                            if (buzt == null) {
                                buzt = buzt.f155423f;
                            }
                            int a2 = buzz.m120822a(buzt.f155426b);
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            if (a2 == 1) {
                                buwc.m120564a(bvdo.f155661b, buzk);
                                bvct = bvdo.mo73340a(new buwc(bvdo.f155661b, buzk));
                                break;
                            } else if (a2 != 2) {
                                Context context = bvdo.f155661b;
                                int i3 = Build.VERSION.SDK_INT;
                                buxb buxb = (buxb) ahgz.m55755b(context, buxb.class);
                                if (buxb != null && buxb.mo73228c()) {
                                    bvct = bvdo.mo73340a(new buvi(bvdo.f155661b, buzk));
                                    break;
                                } else {
                                    throw new bvdl(buxb.class, buvi.class);
                                }
                            } else {
                                throw new bvdj("WiFi is no longer supported");
                            }
                        }
                        break;
                    case 3:
                        bval bval = bvbb.f155515d;
                        if (bval == null) {
                            bval = bval.f155487d;
                        }
                        if ((bval.f155489a & 1) != 0) {
                            bvct = bvdo.mo73340a(new bvdq(bvdo.f155661b, bval));
                        }
                        break;
                    case 4:
                        buyq buyq = bvbb.f155516e;
                        if (buyq == null) {
                            buyq = buyq.f155323f;
                        }
                        int a3 = buyt.m120786a(buyq.f155326b);
                        if (a3 != 0) {
                            i = a3;
                        }
                        int i4 = i - 1;
                        if (i4 != 2) {
                            if (i4 == 3) {
                                buvb.m120493a(bvdo.f155661b, buyq);
                                Context context2 = bvdo.f155661b;
                                buzq buzq = buyq.f155327c;
                                if (buzq == null) {
                                    buzq = buzq.f155418c;
                                }
                                buyx buyx = buyq.f155329e;
                                if (buyx == null) {
                                    buyx = buyx.f155353d;
                                }
                                bvct = bvdo.mo73339a(new buvb(context2, buzq, buyx));
                                break;
                            } else if (i4 != 4) {
                                break;
                            } else {
                                throw new bvdj("WiFi is no longer supported");
                            }
                        } else {
                            buvw.m120547a(bvdo.f155661b, buyq);
                            Context context3 = bvdo.f155661b;
                            buzh buzh = buyq.f155328d;
                            if (buzh == null) {
                                buzh = buzh.f155378c;
                            }
                            buzq buzq2 = buyq.f155327c;
                            if (buzq2 == null) {
                                buzq2 = buzq.f155418c;
                            }
                            bvct = bvdo.mo73339a(new buvw(context3, buzh, buzq2));
                            break;
                        }
                    case 5:
                        bvad bvad = bvbb.f155517f;
                        if (bvad == null) {
                            bvad = bvad.f155465e;
                        }
                        int a4 = bvak.m120835a(bvad.f155468b);
                        if (a4 != 0) {
                            i = a4;
                        }
                        int i5 = i - 1;
                        if (i5 != 3) {
                            if (i5 == 4) {
                                buvu.m120536a(bvdo.f155661b, bvad);
                                Context context4 = bvdo.f155661b;
                                buzb buzb = bvad.f155470d;
                                if (buzb == null) {
                                    buzb = buzb.f155365f;
                                }
                                bvct = bvdo.mo73339a(new buvu(context4, buzb, workSource, bleFilterArr));
                                break;
                            } else {
                                break;
                            }
                        } else {
                            buvy.m120553a(bvdo.f155661b, bvad);
                            Context context5 = bvdo.f155661b;
                            buzj buzj = bvad.f155469c;
                            if (buzj == null) {
                                buzj = buzj.f155387c;
                            }
                            bvct = bvdo.mo73339a(new buvy(context5, buzj));
                            break;
                        }
                    case 8:
                        buym buym = bvbb.f155520i;
                        if (buym == null) {
                            buym = buym.f155312c;
                        }
                        int a5 = buyp.m120782a(buym.f155315b);
                        if (a5 == 0) {
                            a5 = 1;
                        }
                        int i6 = a5 - 1;
                        if (i6 != 1) {
                            if (i6 == 2) {
                                buvh.m120501a(bvdo.f155661b);
                                bvct = bvdo.mo73340a(new buvh(bvdo.f155661b));
                                break;
                            } else {
                                break;
                            }
                        } else {
                            buwa.m120558a(bvdo.f155661b);
                            bvct = bvdo.mo73340a(new buwa(bvdo.f155661b));
                            break;
                        }
                }
            }
            if (bvct != null) {
                bvaa d = bvct.mo73288d();
                try {
                    bvct.f155607m = new bvec(this, d.f155451b, operationRequest.f191770c);
                    synchronized (this.f155695a) {
                        if (!mo73358b()) {
                            this.f155695a.put(bvct.f155605k, bvct);
                        }
                    }
                    srn srn = bvcm.f155598a;
                    String str = d.f155451b;
                    this.f155696b.obtainMessage(2, bvct).sendToTarget();
                    return new OperationResponse(d);
                } catch (NullPointerException e) {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl.mo68432a("bved", "a", 168, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Received null callback from binder when starting operation '%s'", d.f155451b);
                    return m121016a(d.f155451b, bvac.OPERATION_STATUS_FAILED);
                } catch (RemoteException e2) {
                    bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl2.mo68432a("bved", "a", 172, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68420a("Received dead callback from binder when starting operation '%s'", d.f155451b);
                    return m121016a(d.f155451b, bvac.OPERATION_STATUS_FAILED);
                }
            } else {
                String valueOf = String.valueOf(bvbb);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Unrecognized request: ");
                sb.append(valueOf);
                throw new bvdj(sb.toString());
            }
        } catch (bvdj e3) {
            bnsl bnsl3 = (bnsl) bvcm.f155598a.mo68388c();
            bnsl3.mo68437a(e3);
            bnsl3.mo68432a("bved", "a", (int) MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("Unsupported operation request specified to start.");
            return m121016a(Integer.toString(((bvck) bvct.f155604j).mo73314a().intValue()), bvac.OPERATION_STATUS_FAILED);
        } catch (bvdk e4) {
            bnsl bnsl4 = (bnsl) bvcm.f155598a.mo68388c();
            bnsl4.mo68437a(e4);
            bnsl4.mo68432a("bved", "a", (int) MfiClientException.TYPE_ILLEGAL_LINKAGE_DATA, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Invalid device status to start operation.");
            return m121016a(Integer.toString(((bvck) bvct.f155604j).mo73314a().intValue()), bvac.OPERATION_STATUS_FAILED);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo73358b() {
        boolean z = false;
        if (!this.f155698d.isShutdown()) {
            return false;
        }
        synchronized (this.f155695a) {
            if (this.f155695a.size() == 0) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final OperationResponse mo73268a(String str) {
        bvct b = mo73357b(str);
        if (b == null) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("bved", "a", 190, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("Invalid operation id specified to cancel: %s", str);
            return m121016a(str, bvac.OPERATION_STATUS_MISSING);
        }
        srn srn = bvcm.f155598a;
        this.f155696b.obtainMessage(3, b).sendToTarget();
        return new OperationResponse(b.mo73288d());
    }

    /* renamed from: a */
    public final void mo73356a() {
        this.f155699e.mo73341a(new bvea(this));
    }
}

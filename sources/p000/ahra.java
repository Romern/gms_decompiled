package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.internal.connection.ParcelablePayload;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* renamed from: ahra */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahra implements ahnm {

    /* renamed from: a */
    public final ahnp f67852a;

    /* renamed from: b */
    public final bqgj f67853b = ahhr.m55806b();

    /* renamed from: c */
    public final bqgj f67854c = ahhr.m55806b();

    /* renamed from: d */
    public final ahqz f67855d = new ahqz();

    /* renamed from: e */
    public final ahnz f67856e;

    /* renamed from: f */
    public final ahkn f67857f;

    public ahra(Context context, ahnp ahnp) {
        ahnz ahnz = new ahnz(new ahmt(context));
        ahkn ahkn = new ahkn("sendPayload");
        this.f67852a = ahnp;
        this.f67856e = ahnz;
        ahnp.mo36894a(buuw.PAYLOAD_TRANSFER, this);
        this.f67857f = ahkn;
    }

    /* renamed from: a */
    public static int m56389a(bvih bvih) {
        ahqw ahqw = ahqw.UNKNOWN;
        buum buum = buum.UNKNOWN_EVENT_TYPE;
        buup buup = buup.UNKNOWN_PACKET_TYPE;
        bvih bvih2 = bvih.UNKNOWN_PAYLOAD_STATUS;
        int ordinal = bvih.ordinal();
        if (ordinal != 1) {
            return (ordinal == 7 || ordinal == 8) ? 4 : 2;
        }
        return 1;
    }

    /* renamed from: a */
    public static boolean m56393a(buuq buuq) {
        return (buuq.f154975b & 1) != 0;
    }

    /* renamed from: b */
    public final void mo36995b(ahkv ahkv, String[] strArr, ParcelablePayload parcelablePayload) {
        mo36994a(new ahqt(this, ahkv, strArr, parcelablePayload));
    }

    /* renamed from: a */
    private static bvih m56390a(buum buum) {
        ahqw ahqw = ahqw.UNKNOWN;
        buum buum2 = buum.UNKNOWN_EVENT_TYPE;
        buup buup = buup.UNKNOWN_PACKET_TYPE;
        bvih bvih = bvih.UNKNOWN_PAYLOAD_STATUS;
        int ordinal = buum.ordinal();
        if (ordinal == 1) {
            return bvih.REMOTE_ERROR;
        }
        if (ordinal == 2) {
            return bvih.REMOTE_CANCELLATION;
        }
        ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Unknown PayloadStatus for ControlMessage.EventType %s!", buum);
        return bvih.UNKNOWN_PAYLOAD_STATUS;
    }

    /* renamed from: a */
    private final void m56391a(ahkv ahkv, String str, buut buut, long j, bvih bvih) {
        mo36994a(new ahqq(this, buut, bvih, j, ahkv, str));
        ahqw ahqw = ahqw.UNKNOWN;
        buum buum = buum.UNKNOWN_EVENT_TYPE;
        buup buup = buup.UNKNOWN_PACKET_TYPE;
        bvih bvih2 = bvih.UNKNOWN_PAYLOAD_STATUS;
        int ordinal = bvih.ordinal();
        if (ordinal == 2) {
            m56392a(bnkn.m109665a(str), buut, j, buum.PAYLOAD_ERROR);
        } else if (ordinal != 7) {
            ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("Unhandled finished incoming payload %d with status %s!", buut.f154982b, bvih);
        } else {
            m56392a(bnkn.m109665a(str), buut, j, buum.PAYLOAD_CANCELED);
        }
    }

    /* renamed from: a */
    private final void m56392a(List list, buut buut, long j, buum buum) {
        buut buut2 = buut;
        bxvd da = buun.f154961d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buun buun = (buun) da.f164949b;
        buun.f154964b = buum.f154960d;
        int i = buun.f154963a | 1;
        buun.f154963a = i;
        buun.f154963a = i | 2;
        buun.f154965c = j;
        buun buun2 = (buun) da.mo74062i();
        ahnp ahnp = this.f67852a;
        bxvd da2 = buuu.f154985f.mo74144da();
        buup buup = buup.CONTROL;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        buuu buuu = (buuu) da2.f164949b;
        buuu.f154988b = buup.f154971d;
        int i2 = buuu.f154987a | 1;
        buuu.f154987a = i2;
        buut.getClass();
        buuu.f154989c = buut2;
        int i3 = i2 | 2;
        buuu.f154987a = i3;
        buun2.getClass();
        buuu.f154991e = buun2;
        buuu.f154987a = i3 | 8;
        ahnp.mo36891a(list, ahoy.m56304a(buuw.PAYLOAD_TRANSFER, da2.mo74062i()).mo73642k(), buut2.f154982b, buun2.f154965c, "CONTROL");
    }

    /* renamed from: a */
    public final void mo36991a(ahkv ahkv, String str, PayloadTransferUpdate payloadTransferUpdate, boolean z) {
        ahkv.mo36696a(str, payloadTransferUpdate);
        if (z) {
            this.f67855d.mo36990b(payloadTransferUpdate.f80476a);
        }
    }

    /* renamed from: a */
    public final void mo36782a(ahkv ahkv, String str, CountDownLatch countDownLatch) {
        mo36994a(new ahqm(this, str, ahkv, countDownLatch));
    }

    /* renamed from: a */
    public final void mo36992a(ahkv ahkv, List list, buut buut, long j, bvih bvih) {
        mo36994a(new ahqk(this, buut, bvih, j, list, ahkv));
        ahqw ahqw = ahqw.UNKNOWN;
        buum buum = buum.UNKNOWN_EVENT_TYPE;
        buup buup = buup.UNKNOWN_PACKET_TYPE;
        bvih bvih2 = bvih.UNKNOWN_PAYLOAD_STATUS;
        int ordinal = bvih.ordinal();
        if (ordinal == 2) {
            m56392a(list, buut, j, buum.PAYLOAD_ERROR);
        } else if (ordinal == 3) {
        } else {
            if (ordinal == 4) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f67852a.mo36892a(ahkv, (String) it.next());
                }
            } else if (ordinal == 7) {
                m56392a(list, buut, j, buum.PAYLOAD_CANCELED);
            } else if (ordinal != 8) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68420a("Unhandled finished outgoing payload with status %s!", bvih);
            }
        }
    }

    /* renamed from: a */
    public final void mo36993a(ahkv ahkv, String[] strArr, ParcelablePayload parcelablePayload) {
        mo36994a(new ahqs(ahkv, strArr, parcelablePayload));
    }

    /* renamed from: a */
    public final void mo36784a(buuj buuj, String str, ahkv ahkv, bvif bvif) {
        buuu buuu;
        buuq buuq;
        ahnq ahnq;
        String str2;
        String str3 = str;
        ahkv ahkv2 = ahkv;
        buux buux = buuj.f154950c;
        if (buux == null) {
            buux = buux.f155003j;
        }
        buuu buuu2 = buux.f155009e;
        if (buuu2 != null) {
            buuu = buuu2;
        } else {
            buuu = buuu.f154985f;
        }
        ahqw ahqw = ahqw.UNKNOWN;
        buum buum = buum.UNKNOWN_EVENT_TYPE;
        buup buup = buup.UNKNOWN_PACKET_TYPE;
        bvih bvih = bvih.UNKNOWN_PAYLOAD_STATUS;
        buup a = buup.m120469a(buuu.f154988b);
        if (a == null) {
            a = buup.UNKNOWN_PACKET_TYPE;
        }
        int ordinal = a.ordinal();
        ahqy ahqy = null;
        buup buup2 = null;
        if (ordinal == 1) {
            buut buut = buuu.f154989c;
            buut buut2 = buut != null ? buut : buut.f154979e;
            buuq buuq2 = buuu.f154990d;
            if (buuq2 == null) {
                buuq = buuq.f154972e;
            } else {
                buuq = buuq2;
            }
            srn srn = ahkm.f67363a;
            if (buuq.f154976c != 0 || m56393a(buuq)) {
                ahqy = this.f67855d.mo36987a(buut2.f154982b);
                if (ahqy == null) {
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68417a("PayloadManager failed to retrieve Payload %d for chunk at offset %d, discarding.", buut2.f154982b, buuq.f154976c);
                    return;
                }
            } else {
                mo36994a(new ahqn(ahkv2, str3, buut2));
                ahnz ahnz = this.f67856e;
                buup a2 = buup.m120469a(buuu.f154988b);
                if (a2 == null) {
                    a2 = buup.UNKNOWN_PACKET_TYPE;
                }
                if (a2 == buup.DATA) {
                    buut buut3 = buuu.f154989c;
                    if (buut3 == null) {
                        buut3 = buut.f154979e;
                    }
                    int a3 = buus.m120474a(buut3.f154983c);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i = a3 - 1;
                    if (i == 1) {
                        aiic aiic = new aiic();
                        buut buut4 = buuu.f154989c;
                        if (buut4 == null) {
                            buut4 = buut.f154979e;
                        }
                        aiic.mo37510a(buut4.f154982b);
                        aiic.mo37509a(1);
                        buuq buuq3 = buuu.f154990d;
                        if (buuq3 == null) {
                            buuq3 = buuq.f154972e;
                        }
                        aiic.mo37513a(buuq3.f154977d.mo73780k());
                        ahnq = new ahnr(aiic.f68912a);
                    } else if (i == 2) {
                        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Nearby");
                        if (!file.exists() && !file.mkdirs()) {
                            bnsl bnsl = (bnsl) ahkm.f67363a.mo68387b();
                            buut buut5 = buuu.f154989c;
                            if (buut5 == null) {
                                buut5 = buut.f154979e;
                            }
                            bnsl.mo68415a("Failed to create InternalPayload %d because unable to create Nearby directory.", buut5.f154982b);
                            ahnq = null;
                        } else {
                            buut buut6 = buuu.f154989c;
                            if (buut6 == null) {
                                buut6 = buut.f154979e;
                            }
                            File file2 = new File(file, String.valueOf(buut6.f154982b));
                            try {
                                ParcelFileDescriptor open = ParcelFileDescriptor.open(file2, 671088640);
                                Uri a4 = C1136kk.m17966a(ahnz.f67646a.f67572a, "com.google.android.gms.fileprovider", file2);
                                aiic aiic2 = new aiic();
                                buut buut7 = buuu.f154989c;
                                if (buut7 == null) {
                                    buut7 = buut.f154979e;
                                }
                                aiic2.mo37510a(buut7.f154982b);
                                aiic2.mo37509a(2);
                                aiic2.mo37511a(open);
                                aiic2.mo37512a(file2.getPath());
                                buut buut8 = buuu.f154989c;
                                if (buut8 == null) {
                                    buut8 = buut.f154979e;
                                }
                                aiic2.mo37514b(buut8.f154984d);
                                ParcelablePayload parcelablePayload = aiic2.f68912a;
                                parcelablePayload.f80612h = a4;
                                Context context = ahkv2.f67387c;
                                String str4 = ahkv2.f67388d;
                                int i2 = Build.VERSION.SDK_INT;
                                context.grantUriPermission(str4, a4, 67);
                                ahnq = new ahns(parcelablePayload);
                            } catch (IOException e) {
                                bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68387b();
                                bnsl2.mo68437a(e);
                                buut buut9 = buuu.f154989c;
                                if (buut9 == null) {
                                    buut9 = buut.f154979e;
                                }
                                bnsl2.mo68418a("Failed to create InternalPayload %d because unable to create java file %s.", buut9.f154982b, file2.getPath());
                                ahnq = null;
                            }
                        }
                    } else if (i != 3) {
                        ahnq = null;
                    } else {
                        try {
                            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                            aiic aiic3 = new aiic();
                            buut buut10 = buuu.f154989c;
                            if (buut10 == null) {
                                buut10 = buut.f154979e;
                            }
                            aiic3.mo37510a(buut10.f154982b);
                            aiic3.mo37509a(3);
                            aiic3.mo37511a(createPipe[0]);
                            ahnq = new ahnt(aiic3.f68912a, createPipe[1]);
                        } catch (IOException e2) {
                            bnsl bnsl3 = (bnsl) ahkm.f67363a.mo68387b();
                            bnsl3.mo68437a(e2);
                            buut buut11 = buuu.f154989c;
                            if (buut11 == null) {
                                buut11 = buut.f154979e;
                            }
                            bnsl3.mo68415a("Failed to create InternalPayload %d because unable to create ParcelFileDescriptor pipe.", buut11.f154982b);
                            ahnq = null;
                        }
                    }
                } else {
                    ahnq = null;
                }
                if (ahnq != null) {
                    ahqy = new ahqy(ahnq, bnkn.m109665a(str3), true);
                    this.f67855d.mo36989a(ahnq.mo36897a(), ahqy);
                }
                if (ahqy == null) {
                    bnsl bnsl4 = (bnsl) ahkm.f67363a.mo68388c();
                    long j = buut2.f154982b;
                    int a5 = buus.m120474a(buut2.f154983c);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    if (a5 != 1) {
                        str2 = a5 != 2 ? a5 != 3 ? "STREAM" : "FILE" : "BYTES";
                    } else {
                        str2 = "UNKNOWN_PAYLOAD_TYPE";
                    }
                    bnsl4.mo68418a("PayloadManager failed to create InternalPayload from PayloadTransferFrame with ID %d and type %s, aborting receipt.", j, str2);
                    mo36994a(new ahqo(ahkv2, str3, buut2));
                    m56392a(bnkn.m109665a(str3), buut2, buuq.f154976c, buum.PAYLOAD_ERROR);
                    return;
                }
                mo36994a(new ahqp(ahkv2, str3, ahqy));
            }
            if (ahqy.mo36983b()) {
                m56391a(ahkv, str, buut2, buuq.f154976c, bvih.LOCAL_CANCELLATION);
                return;
            }
            ahqy.mo36980a(str3, buuq.f154976c);
            try {
                ahqy.f67847a.mo36898a(buuq.f154977d.mo73780k());
                mo36994a(new ahqr(this, buut2, buuq, ahkv, str));
            } catch (IOException e3) {
                ((bnsl) ahkm.f67363a.mo68387b()).mo68420a("Unable to attach chunk for incoming Payload %s, abandoning.", ahqy);
                m56391a(ahkv, str, buut2, buuq.f154976c, bvih.LOCAL_ERROR);
            }
        } else if (ordinal != 2) {
            bnsl bnsl5 = (bnsl) ahkm.f67363a.mo68390d();
            if ((buuu.f154987a & 1) != 0 && (buup2 = buup.m120469a(buuu.f154988b)) == null) {
                buup2 = buup.UNKNOWN_PACKET_TYPE;
            }
            bnsl5.mo68420a("Unhandled PayloadTransferFrame of type %s!", buup2);
        } else {
            buut buut12 = buuu.f154989c;
            if (buut12 == null) {
                buut12 = buut.f154979e;
            }
            buun buun = buuu.f154991e;
            if (buun == null) {
                buun = buun.f154961d;
            }
            ahqy a6 = this.f67855d.mo36987a(buut12.f154982b);
            if (a6 == null) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68418a("Got ControlMessage for unknown payload %d, ignoring: %s", buut12.f154982b, buun);
                return;
            }
            buum a7 = buum.m120464a(buun.f154964b);
            if (a7 == null) {
                a7 = buum.UNKNOWN_EVENT_TYPE;
            }
            int ordinal2 = a7.ordinal();
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    bnsl bnsl6 = (bnsl) ahkm.f67363a.mo68390d();
                    buum a8 = buum.m120464a(buun.f154964b);
                    if (a8 == null) {
                        a8 = buum.UNKNOWN_EVENT_TYPE;
                    }
                    bnsl6.mo68424a("Unhandled control message %s for payload %s!", a8, a6);
                    return;
                }
                if (a6.f67848b) {
                    long j2 = buun.f154965c;
                    buum a9 = buum.m120464a(buun.f154964b);
                    if (a9 == null) {
                        a9 = buum.UNKNOWN_EVENT_TYPE;
                    }
                    m56391a(ahkv, str, buut12, j2, m56390a(a9));
                } else {
                    a6.mo36981a(str3, buun);
                }
                srn srn2 = ahkm.f67363a;
            } else if (a6.f67848b) {
                long j3 = buun.f154965c;
                buum a10 = buum.m120464a(buun.f154964b);
                if (a10 == null) {
                    a10 = buum.UNKNOWN_EVENT_TYPE;
                }
                m56391a(ahkv, str, buut12, j3, m56390a(a10));
            } else {
                a6.mo36981a(str3, buun);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36994a(Runnable runnable) {
        this.f67854c.execute(runnable);
    }
}

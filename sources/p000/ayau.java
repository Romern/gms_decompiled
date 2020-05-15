package p000;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ayau */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayau implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ayaw f96978a;

    /* renamed from: b */
    private final InputStream f96979b;

    /* renamed from: c */
    private final String f96980c;

    /* renamed from: d */
    private final ayas f96981d;

    /* renamed from: e */
    private final ayan f96982e;

    /* renamed from: f */
    private final axyk f96983f;

    /* renamed from: g */
    private final axua f96984g;

    /* renamed from: h */
    private final ayax f96985h = aybb.m83726a();

    /* renamed from: i */
    private final ayaz f96986i = new ayaz();

    public ayau(ayaw ayaw, InputStream inputStream, ayeo ayeo, ayas ayas, ayan ayan, axua axua) {
        axyk axyk;
        this.f96978a = ayaw;
        this.f96979b = inputStream;
        this.f96980c = ayeo.f97342b;
        int i = ayeo.f97345e;
        String str = ayaw.f96988a;
        if (i != 0) {
            axyk = new axyn(str);
        } else {
            axyk = new axyl(str);
        }
        this.f96983f = axyk;
        this.f96981d = ayas;
        this.f96982e = ayan;
        this.f96984g = axua;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        if (android.util.Log.isLoggable("WearableVerbose", 2) != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0151, code lost:
        if (android.util.Log.isLoggable("WearableVerbose", 2) != false) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0168, code lost:
        if (android.util.Log.isLoggable("WearableVerbose", 2) != false) goto L_0x016a;
     */
    public final void run() {
        axyk axyk;
        ayev ayev;
        boolean z;
        Thread currentThread = Thread.currentThread();
        String valueOf = String.valueOf(this.f96980c);
        currentThread.setName(valueOf.length() == 0 ? new String("Wear:Reader-") : "Wear:Reader-".concat(valueOf));
        bxvd bxvd = null;
        while (!Thread.interrupted()) {
            try {
                if (bxvd == null) {
                    bxvd = ayew.f97392g.mo74144da();
                }
                int a = aybb.m83724a(this.f96985h, this.f96979b, bxvd, this.f96981d, this.f96984g);
                if (((ayew) bxvd.f164949b).f97398e != 1) {
                    ayaz ayaz = this.f96986i;
                    ayew ayew = (ayew) bxvd.mo74062i();
                    if (!Log.isLoggable("wearable", 3)) {
                    }
                    String valueOf2 = String.valueOf(aybb.m83735b(ayew));
                    Log.d("wearable", valueOf2.length() == 0 ? new String("incoming message piece: ") : "incoming message piece: ".concat(valueOf2));
                    if (ayew.f97398e > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sdo.m34975b(z, "processIncomingMessagePiece called with single-piece message.");
                    int i = ayew.f97399f;
                    if (i != -1) {
                        List list = (List) ayaz.f97006a.get(i);
                        if (list != null) {
                            if (!((ayew) list.get(0)).f97396c.equals(ayew.f97396c)) {
                                int size = list.size();
                                StringBuilder sb = new StringBuilder(65);
                                sb.append("WearableReader: Message digest mismatch after ");
                                sb.append(size);
                                sb.append(" pieces.");
                                throw new IOException(sb.toString());
                            }
                        }
                        if (list == null) {
                            list = new ArrayList(ayew.f97398e);
                            ayaz.f97006a.put(ayew.f97399f, list);
                        }
                        list.add(ayew);
                        if (list.size() == ayew.f97397d) {
                            if (list.size() < ayew.f97398e) {
                                if (!Log.isLoggable("wearable", 3)) {
                                    if (!Log.isLoggable("WearableVerbose", 2)) {
                                        ayev = null;
                                    }
                                }
                                int size2 = list.size();
                                String b = aybb.m83735b(ayew);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 85);
                                sb2.append("Message not completed yet, number of pieces received: ");
                                sb2.append(size2);
                                sb2.append(" for message piece: ");
                                sb2.append(b);
                                Log.d("wearable", sb2.toString());
                                ayev = null;
                            } else {
                                if (Log.isLoggable("wearable", 3)) {
                                }
                                Log.d("wearable", "Message pieces are all here - reconstructing message.");
                                ayev = aybb.m83728a(list);
                                if (Log.isLoggable("wearable", 2)) {
                                }
                                String valueOf3 = String.valueOf(ayev);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 50);
                                sb3.append("Message reconstruct completed, returning message: ");
                                sb3.append(valueOf3);
                                Log.v("wearable", sb3.toString());
                                list.clear();
                                ayaz.f97006a.delete(ayew.f97399f);
                            }
                            bxvd = null;
                        } else {
                            int size3 = list.size();
                            int i2 = ayew.f97397d;
                            StringBuilder sb4 = new StringBuilder(79);
                            sb4.append("Message piece received out of order; expected: ");
                            sb4.append(size3);
                            sb4.append(" but got: ");
                            sb4.append(i2);
                            String sb5 = sb4.toString();
                            list.clear();
                            ayaz.f97006a.delete(ayew.f97399f);
                            throw new IOException(sb5);
                        }
                    } else {
                        throw new IOException("Message piece has an invalid queue id.");
                    }
                } else {
                    ayaw.m83718a("only one message piece");
                    ayev = aybb.m83727a((ayew) bxvd.mo74062i());
                    bxvd.f164949b = (bxvk) bxvd.f164949b.mo74142c(4);
                }
                if (ayev != null) {
                    axzx a2 = this.f96983f.mo53767a(ayev);
                    axya a3 = aybb.m83725a(a2.f96871a);
                    this.f96978a.f96990c.mo53756a(a3, "bytesRecv", a);
                    this.f96978a.f96990c.mo53756a(a3, "msgsRecv", 1);
                    if ((a2.f96871a.f97378a & 512) == 0) {
                        ayan ayan = this.f96982e;
                        ayan.f96946f = true;
                        ayan.mo53837c();
                        if (a2.f96873c) {
                            Iterator it = this.f96978a.f96993f.iterator();
                            while (it.hasNext()) {
                                ((axyu) it.next()).mo53590a(this.f96980c, a2.f96871a, a2.f96872b);
                            }
                        }
                    } else if (Log.isLoggable("Wear_Transport", 2)) {
                        Log.v("Wear_Transport", "Heartbeat message received.");
                    }
                }
            } catch (IOException e) {
                String valueOf4 = String.valueOf(e.getMessage());
                String str = valueOf4.length() == 0 ? new String("reader threw IOException: ") : "reader threw IOException: ".concat(valueOf4);
                ayaw.m83718a(str);
                this.f96981d.mo53842a(str);
                axyk = this.f96983f;
            } catch (Exception e2) {
                String valueOf5 = String.valueOf(e2.getMessage());
                String str2 = valueOf5.length() == 0 ? new String("reader threw unexpected exception: ") : "reader threw unexpected exception: ".concat(valueOf5);
                ayaw.m83718a(str2);
                this.f96981d.mo53842a(str2);
                axyk = this.f96983f;
            } catch (Throwable th) {
                this.f96983f.mo53768a();
                throw th;
            }
        }
        this.f96981d.mo53842a("reader was stopped");
        ayaw.m83718a("WearableReader is finished.");
        axyk = this.f96983f;
        axyk.mo53768a();
    }
}

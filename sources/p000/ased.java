package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import android.util.Patterns;
import com.google.android.gms.statementservice.ChimeraOperationService;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ased */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ased {

    /* renamed from: a */
    private final Context f88748a;

    /* renamed from: b */
    private final asek f88749b;

    /* renamed from: c */
    private final int f88750c;

    public ased(Context context) {
        asek asek = new asek(new shl(context, (byte[]) null));
        int intValue = ((Integer) aseh.f88764c.mo58455c()).intValue();
        this.f88748a = context;
        this.f88749b = asek;
        this.f88750c = intValue;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:132:0x00b1 */
    /* JADX WARN: Type inference failed for: r10v0, assign insn: 0x0037: CONST  (r10v0 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r10v1, assign insn: PHI: (r10v1 ?) = (r10v0 ?), (r10v26 ?) binds: [B:8:0x004b, B:116:0x0352] */
    /* JADX WARN: Type inference failed for: r10v26, assign insn: 0x0372: CONST  (r10v26 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x02b9, code lost:
        r0 = java.lang.String.valueOf(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02c3, code lost:
        if (r0.length() == 0) goto L_0x02c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02c5, code lost:
        r0 = new java.lang.String("Timeout verifying host ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02cb, code lost:
        r0 = "Timeout verifying host ".concat(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02cf, code lost:
        android.util.Log.w("HostsVerifier", r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02b8 A[ExcHandler: TimeoutException (e java.util.concurrent.TimeoutException), Splitter:B:58:0x022c] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final List mo49085a(String str, List list, String str2) {
        ased ased;
        int i;
        asei asei;
        ased ased2 = this;
        String str3 = str;
        List list2 = list;
        String str4 = str2;
        if (list.size() != 0) {
            try {
                Context context = ased2.f88748a;
                if (asej.f88774a.matcher(str4).matches()) {
                    ArrayList arrayList = new ArrayList();
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(str4, 64).signatures;
                    int length = signatureArr.length;
                    ArrayList arrayList2 = new ArrayList(length);
                    ? r10 = 0;
                    for (Signature signature : signatureArr) {
                        arrayList2.add(asej.m73866a(signature.toByteArray()));
                    }
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        i = 1;
                        if (!it.hasNext()) {
                            break;
                        }
                        String str5 = (String) it.next();
                        bxvd da = bqyh.f141944d.mo74144da();
                        bxvd da2 = bqyg.f141939d.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bqyg bqyg = (bqyg) da2.f164949b;
                        str2.getClass();
                        bqyg.f141941a |= 1;
                        bqyg.f141942b = str4;
                        bxvd da3 = bqyf.f141935c.mo74144da();
                        if (da3.f164950c) {
                            da3.mo74035c();
                            da3.f164950c = false;
                        }
                        bqyf bqyf = (bqyf) da3.f164949b;
                        str5.getClass();
                        bqyf.f141937a |= 1;
                        bqyf.f141938b = str5;
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bqyg bqyg2 = (bqyg) da2.f164949b;
                        bqyf bqyf2 = (bqyf) da3.mo74062i();
                        bqyf2.getClass();
                        bqyg2.f141943c = bqyf2;
                        bqyg2.f141941a |= 2;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bqyh bqyh = (bqyh) da.f164949b;
                        bqyg bqyg3 = (bqyg) da2.mo74062i();
                        bqyg3.getClass();
                        bqyh.f141948c = bqyg3;
                        bqyh.f141946a |= 2;
                        arrayList.add((bqyh) da.mo74062i());
                        ased2 = this;
                        r10 = 0;
                    }
                    if (list.size() * arrayList.size() > ased.f88750c) {
                        Object[] objArr = new Object[4];
                        objArr[r10] = Integer.valueOf(list.size());
                        objArr[1] = Integer.valueOf(arrayList.size());
                        objArr[2] = Integer.valueOf(list.size() * arrayList.size());
                        objArr[3] = Integer.valueOf(ased.f88750c);
                        Log.w("HostsVerifier", String.format("Verification failed because there are too many hosts or app certs. %d hosts X %d certs = %d, which is greater than %d, the maximum number of requests per verification.", objArr));
                        return list2;
                    }
                    ArrayList arrayList3 = new ArrayList(list.size());
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = list.iterator();
                    boolean z = r10;
                    while (it2.hasNext()) {
                        String str6 = (String) it2.next();
                        if (str6 != null) {
                            try {
                                if (Patterns.DOMAIN_NAME.matcher(str6).matches()) {
                                    if (!str3.equals("http")) {
                                        if (!str3.equals("https")) {
                                            throw new MalformedURLException("Input scheme is not valid.");
                                        }
                                    }
                                    String url = new URL(str3, str6, "").toString();
                                    bxvd da4 = bqyh.f141944d.mo74144da();
                                    bxvd da5 = bqyk.f141959c.mo74144da();
                                    if (da5.f164950c) {
                                        da5.mo74035c();
                                        da5.f164950c = z;
                                    }
                                    bqyk bqyk = (bqyk) da5.f164949b;
                                    url.getClass();
                                    bqyk.f141961a |= i;
                                    bqyk.f141962b = url;
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    bqyh bqyh2 = (bqyh) da4.f164949b;
                                    bqyk bqyk2 = (bqyk) da5.mo74062i();
                                    bqyk2.getClass();
                                    bqyh2.f141947b = bqyk2;
                                    bqyh2.f141946a |= i;
                                    aseg aseg = new aseg((bqyh) da4.mo74062i(), arrayList, ased.f88749b, ased.f88748a);
                                    List list3 = aseg.f88757b;
                                    int size = list3.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        bqyh bqyh3 = (bqyh) list3.get(i2);
                                        bxvd da6 = bqyi.f141949e.mo74144da();
                                        bqyh bqyh4 = aseg.f88756a;
                                        List list4 = list3;
                                        if (da6.f164950c) {
                                            da6.mo74035c();
                                            da6.f164950c = false;
                                        }
                                        bqyi bqyi = (bqyi) da6.f164949b;
                                        bqyh4.getClass();
                                        bqyi.f141952b = bqyh4;
                                        int i3 = bqyi.f141951a | 1;
                                        bqyi.f141951a = i3;
                                        "delegate_permission/common.handle_all_urls".getClass();
                                        int i4 = i3 | 2;
                                        bqyi.f141951a = i4;
                                        bqyi.f141953c = "delegate_permission/common.handle_all_urls";
                                        bqyh3.getClass();
                                        bqyi.f141954d = bqyh3;
                                        bqyi.f141951a = i4 | 4;
                                        asee asee = new asee(aseg);
                                        Context context2 = aseg.f88759d;
                                        ChimeraOperationService.f108279a.add(new asef(aseg, (bqyi) da6.mo74062i(), asee, ((Integer) aseh.f88769h.mo58455c()).intValue()));
                                        context2.startService(spn.m35889g("com.google.android.gms.statementservice.EXECUTE"));
                                        i2++;
                                        list3 = list4;
                                    }
                                    arrayList3.add(aseg);
                                    ased = this;
                                    z = false;
                                    i = 1;
                                }
                            } catch (MalformedURLException e) {
                                String message = e.getMessage();
                                StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 26 + String.valueOf(message).length());
                                sb.append("Invalid host to verify (");
                                sb.append(str6);
                                sb.append("):");
                                sb.append(message);
                                Log.e("HostsVerifier", sb.toString());
                                arrayList3.add(null);
                                ased = this;
                                z = false;
                                i = 1;
                            }
                        }
                        throw new MalformedURLException("Input host is not valid.");
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                        aseg aseg2 = (aseg) arrayList3.get(i5);
                        String str7 = (String) list2.get(i5);
                        if (aseg2 != null) {
                            try {
                                long intValue = (((long) ((Integer) aseh.f88766e.mo58455c()).intValue()) + currentTimeMillis) - System.currentTimeMillis();
                                if (intValue < 10) {
                                    intValue = 10;
                                }
                                asei = aseg2.f88760e;
                                if (!asei.f88772b.await(intValue, TimeUnit.MILLISECONDS)) {
                                    String valueOf = String.valueOf(asei.f88771a);
                                    Log.w("StatementServiceResFut", valueOf.length() == 0 ? new String("Timeout while waiting for verifications to complete on ") : "Timeout while waiting for verifications to complete on ".concat(valueOf));
                                    throw new TimeoutException();
                                } else if (((Boolean) asei.f88773c).booleanValue()) {
                                }
                            } catch (InterruptedException e2) {
                                String valueOf2 = String.valueOf(asei.f88771a);
                                Log.e("StatementServiceResFut", valueOf2.length() == 0 ? new String("Interrupted while waiting for verifications to complete on ") : "Interrupted while waiting for verifications to complete on ".concat(valueOf2));
                                throw e2;
                            } catch (TimeoutException e3) {
                            } catch (InterruptedException e4) {
                                String valueOf3 = String.valueOf(str7);
                                Log.w("HostsVerifier", valueOf3.length() == 0 ? new String("Interrupted verifying host ") : "Interrupted verifying host ".concat(valueOf3));
                            }
                        }
                        arrayList4.add(str7);
                    }
                    return arrayList4;
                }
                throw new PackageManager.NameNotFoundException("Input package name is not valid.");
            } catch (PackageManager.NameNotFoundException e5) {
                String valueOf4 = String.valueOf(e5.getMessage());
                Log.e("HostsVerifier", valueOf4.length() == 0 ? new String("Could not find package to verify: ") : "Could not find package to verify: ".concat(valueOf4));
                return list2;
            }
        } else {
            throw new IllegalArgumentException("List of hosts must be nonempty.");
        }
    }
}

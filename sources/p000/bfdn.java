package p000;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: bfdn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfdn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bfdw f113493a;

    public bfdn(bfdw bfdw) {
        this.f113493a = bfdw;
    }

    /* renamed from: a */
    private final void m96438a() {
        bfdw bfdw = this.f113493a;
        if (bfdw.f113528f != null) {
            bfdw.f113527e.post(new bfdm(this));
        }
        bfdw bfdw2 = this.f113493a;
        if (bfdw2.f113526d) {
            bfdw2.mo61513d();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bfdp.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bfdp.a(java.lang.String, int):void
      bfdp.a(java.lang.String, bfdq):void
      bfdp.a(int, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x035a A[Catch:{ InterruptedException -> 0x04a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0409 A[Catch:{ InterruptedException -> 0x04a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0423 A[SYNTHETIC, Splitter:B:220:0x0423] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0460 A[SYNTHETIC, Splitter:B:244:0x0460] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0470 A[SYNTHETIC, Splitter:B:254:0x0470] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0491  */
    public final void run() {
        BufferedReader bufferedReader;
        int i;
        int i2;
        int i3;
        bfdp bfdp;
        bfdw bfdw;
        Iterator it;
        boolean z;
        List c;
        StringBuilder sb;
        int i4;
        Throwable th;
        FileOutputStream fileOutputStream;
        IOException iOException;
        Iterator it2;
        Iterator it3;
        File file = new File(this.f113493a.f113525c);
        String[] list = file.list();
        if (list == null) {
            bfdw bfdw2 = this.f113493a;
            String valueOf = String.valueOf(bfdw2.f113525c);
            bfdw2.mo61507a(valueOf.length() == 0 ? new String("Failed to list files in directory:") : "Failed to list files in directory:".concat(valueOf));
            return;
        }
        int length = list.length;
        if (length == 0) {
            m96438a();
            return;
        } else if (!bfgo.f113789a.mo61667b(file)) {
            try {
                bufferedReader = new BufferedReader(new FileReader(bfhd.m96751b(file.getAbsolutePath())));
                int a = bfhd.m96750a(bufferedReader);
                int a2 = bfhd.m96750a(bufferedReader);
                int a3 = bfhd.m96750a(bufferedReader);
                char c2 = 0;
                boolean z2 = a >= 2 && bfhd.m96750a(bufferedReader) == 1;
                if (a >= 3) {
                    i = bfhd.m96750a(bufferedReader);
                    i2 = bfhd.m96750a(bufferedReader);
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (a >= 4) {
                    i3 = bfhd.m96750a(bufferedReader);
                } else {
                    i3 = 0;
                }
                bfhd bfhd = new bfhd(z2);
                bfhd.f113878a = a2;
                bfhd.f113879b = a3;
                bfhd.f113880c = i;
                bfhd.f113881d = i2;
                bfhd.f113882e = i3;
                bufferedReader.close();
                boolean z3 = (bfhd.mo61688a() == 0 || bfhd.mo61692b() == 0) ? false : true;
                Locale locale = Locale.US;
                Object[] objArr = {Boolean.valueOf(bfhd.mo61693c()), Boolean.valueOf(z3)};
                if (!bfhd.mo61693c()) {
                    if (!z3) {
                        String valueOf2 = String.valueOf(bfhd);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
                        sb2.append("Not uploading session since missing required data: ");
                        sb2.append(valueOf2);
                        sb2.toString();
                        bfdw bfdw3 = this.f113493a;
                        if (bfdw3.f113526d) {
                            bfdw3.mo61508a(file);
                        }
                        m96438a();
                        return;
                    }
                }
                bfdw bfdw4 = this.f113493a;
                ArrayList arrayList = new ArrayList();
                String str = null;
                String str2 = null;
                for (String str3 : list) {
                    if (str3.equals("sessionId")) {
                        str = bfdw4.mo61509b(str3);
                        if (bfib.m96840a(str)) {
                            str = null;
                        }
                    } else if (str3.equals("uploadedSeq")) {
                        str2 = bfdw4.mo61509b(str3);
                    } else if (!str3.equals("sessionSummary")) {
                        arrayList.add(str3);
                    }
                }
                if (str == null) {
                    str = bfgm.m96657b();
                    bfdw4.mo61512c(str);
                }
                bfdp = new bfdp(bfdw4, arrayList, str);
                if (str2 != null) {
                    String[] split = str2.trim().split(",");
                    for (String str4 : split) {
                        if (!bfib.m96840a(str4)) {
                            try {
                                bfdp.mo61472a(Integer.parseInt(str4.trim()));
                            } catch (NumberFormatException e) {
                                String valueOf3 = String.valueOf(str4);
                                if (valueOf3.length() == 0) {
                                    new String("Invalid number, ignoring seqNum ");
                                } else {
                                    "Invalid number, ignoring seqNum ".concat(valueOf3);
                                }
                            }
                        }
                    }
                }
                if (bfdp.f113496a.size() != 0) {
                    this.f113493a.f113532j = bfdp.f113497b != null;
                    if (!bfgo.f113789a.mo61664a(this.f113493a.f113525c)) {
                        this.f113493a.mo61507a("Failed to lock working directory.");
                        return;
                    }
                    bfdw = this.f113493a;
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = {Integer.valueOf(bfdp.f113496a.size()), bfdp.f113497b};
                    bfdw.f113536n = new bfdv(bfdw, bfdp, bfdw.f113528f);
                    bfgm bfgm = new bfgm(bfdw.f113523a, bfdw.f113533k, 2, null, bfdw.f113524b, null, null, bfdw.f113536n, bfdp.f113497b, bfdw.f113530h, null);
                    bfdw.f113529g = System.currentTimeMillis() + 3600000;
                    Iterator it4 = bfdp.f113496a.iterator();
                    loop2:
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        String str5 = (String) it.next();
                        bfdw.mo61511c();
                        if (bfdw.f113534l) {
                            break;
                        }
                        Locale locale3 = Locale.US;
                        new Object[1][c2] = str5;
                        String valueOf4 = String.valueOf(bfdw.f113525c);
                        String valueOf5 = String.valueOf(str5);
                        bfdf bfdf = new bfdf(valueOf5.length() == 0 ? new String(valueOf4) : valueOf4.concat(valueOf5), bfmf.m97226a(bfdw.f113531i, bfdw.f113530h));
                        bfdq bfdq = bfdq.READ_SUCCESS;
                        while (true) {
                            try {
                                byte[] a4 = bfdf.mo61460a();
                                if (a4 == null) {
                                    it3 = it;
                                    break;
                                } else if (bfdw.f113534l) {
                                    String valueOf6 = String.valueOf(str5);
                                    if (valueOf6.length() == 0) {
                                        new String("Stopped processing the rest of file ");
                                    } else {
                                        "Stopped processing the rest of file ".concat(valueOf6);
                                    }
                                    bfgm.f113777c = true;
                                    bfdq = bfdq.READ_INTERRUPTED;
                                    it3 = it;
                                } else {
                                    bsax bsax = new bsax(bgox.f117045al);
                                    bsax.mo70111a(a4);
                                    if (bsax.mo70112a()) {
                                        bsax a5 = bfib.m96838a(bsax.mo70129e(6));
                                        bsax.mo70139k(6);
                                        int b = a5.mo70114b(3);
                                        bfdp.mo61474a(str5, b);
                                        if (!bfdp.mo61478b(b)) {
                                            Locale locale4 = Locale.US;
                                            it2 = it;
                                            try {
                                                new Object[1][0] = Integer.valueOf(b);
                                                if (!bfgm.mo61668b(bsax, a5)) {
                                                    bfdw.f113536n.mo61494a(bfdp.f113497b, b, "Fatal: can not submit task.");
                                                    try {
                                                        bfdf.mo61461b();
                                                        break loop2;
                                                    } catch (IOException e2) {
                                                    }
                                                } else {
                                                    it = it2;
                                                }
                                            } catch (IllegalArgumentException e3) {
                                                bfdq = bfdq.READ_FAILURE;
                                                bfdf.mo61461b();
                                                bfdp.mo61475a(str5, bfdq);
                                                bfdw.f113536n.mo61495a(bfdp.f113497b, str5);
                                                Locale locale5 = Locale.US;
                                                new Object[1][0] = str5;
                                                it4 = it2;
                                                c2 = 0;
                                            } catch (FileNotFoundException e4) {
                                                bfdq = bfdq.READ_FAILURE;
                                                bfdf.mo61461b();
                                                bfdp.mo61475a(str5, bfdq);
                                                bfdw.f113536n.mo61495a(bfdp.f113497b, str5);
                                                Locale locale52 = Locale.US;
                                                new Object[1][0] = str5;
                                                it4 = it2;
                                                c2 = 0;
                                            } catch (IOException e5) {
                                                try {
                                                    bfdq = bfdq.READ_FAILURE;
                                                    bfdf.mo61461b();
                                                    bfdp.mo61475a(str5, bfdq);
                                                    bfdw.f113536n.mo61495a(bfdp.f113497b, str5);
                                                    Locale locale522 = Locale.US;
                                                    new Object[1][0] = str5;
                                                    it4 = it2;
                                                    c2 = 0;
                                                } catch (Throwable th2) {
                                                    Throwable th3 = th2;
                                                    bfgo.f113789a.mo61666b(this.f113493a.f113525c);
                                                    throw th3;
                                                }
                                            } catch (bfde e6) {
                                                bfdq = bfdq.INVALID_FORMAT;
                                                try {
                                                    bfdf.mo61461b();
                                                } catch (IOException e7) {
                                                }
                                                bfdp.mo61475a(str5, bfdq);
                                                bfdw.f113536n.mo61495a(bfdp.f113497b, str5);
                                                Locale locale5222 = Locale.US;
                                                new Object[1][0] = str5;
                                                it4 = it2;
                                                c2 = 0;
                                            }
                                        } else {
                                            it2 = it;
                                            Locale locale6 = Locale.US;
                                            new Object[1][0] = Integer.valueOf(b);
                                            bfdp.mo61473a(b, true);
                                            it = it2;
                                        }
                                    } else {
                                        throw new IOException("isValid returned after parsing GLocRequest");
                                    }
                                }
                            } catch (IllegalArgumentException e8) {
                                it2 = it;
                                bfdq = bfdq.READ_FAILURE;
                                bfdf.mo61461b();
                                bfdp.mo61475a(str5, bfdq);
                                bfdw.f113536n.mo61495a(bfdp.f113497b, str5);
                                Locale locale52222 = Locale.US;
                                new Object[1][0] = str5;
                                it4 = it2;
                                c2 = 0;
                            } catch (FileNotFoundException e9) {
                                it2 = it;
                                bfdq = bfdq.READ_FAILURE;
                                bfdf.mo61461b();
                                bfdp.mo61475a(str5, bfdq);
                                bfdw.f113536n.mo61495a(bfdp.f113497b, str5);
                                Locale locale522222 = Locale.US;
                                new Object[1][0] = str5;
                                it4 = it2;
                                c2 = 0;
                            } catch (IOException e10) {
                                it2 = it;
                                bfdq = bfdq.READ_FAILURE;
                                bfdf.mo61461b();
                                bfdp.mo61475a(str5, bfdq);
                                bfdw.f113536n.mo61495a(bfdp.f113497b, str5);
                                Locale locale5222222 = Locale.US;
                                new Object[1][0] = str5;
                                it4 = it2;
                                c2 = 0;
                            } catch (bfde e11) {
                                it2 = it;
                                bfdq = bfdq.INVALID_FORMAT;
                                bfdf.mo61461b();
                                bfdp.mo61475a(str5, bfdq);
                                bfdw.f113536n.mo61495a(bfdp.f113497b, str5);
                                Locale locale52222222 = Locale.US;
                                new Object[1][0] = str5;
                                it4 = it2;
                                c2 = 0;
                            }
                        }
                        try {
                            bfdf.mo61461b();
                        } catch (IOException e12) {
                        }
                        bfdp.mo61475a(str5, bfdq);
                        bfdw.f113536n.mo61495a(bfdp.f113497b, str5);
                        Locale locale522222222 = Locale.US;
                        new Object[1][0] = str5;
                        it4 = it2;
                        c2 = 0;
                    }
                    bfgm.mo61669c();
                    while (true) {
                        try {
                            bfdw.mo61511c();
                            bfdw.f113535m.await();
                            z = bfdw.f113526d;
                            boolean z4 = !z;
                            if (z) {
                                if (!z4) {
                                    break;
                                }
                            } else {
                                List list2 = bfdp.f113496a;
                                int size = list2.size();
                                for (int i5 = 0; i5 < size; i5++) {
                                    String str6 = (String) list2.get(i5);
                                    bfia a6 = bfdp.mo61470a(str6);
                                    bmxy.m108582a(a6, "Summary should not be null after all complete.");
                                    if (a6.f113991a != 1 || a6.f113992b != 0 || a6.f113993c != 0 || a6.f113996f != 0) {
                                        if (a6.f113994d != 1) {
                                            String str7 = bfdw.f113525c;
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(str7).length() + 91 + String.valueOf(str6).length());
                                            sb3.append(str7);
                                            sb3.append(str6);
                                            sb3.append(" won't be deleted either because failed to be read or some GLocRequest failed to be upload.");
                                            sb3.toString();
                                        }
                                    }
                                    File file2 = new File(bfdw.f113525c, str6);
                                    try {
                                        if (!file2.delete()) {
                                            String valueOf7 = String.valueOf(file2.getAbsolutePath());
                                            if (valueOf7.length() == 0) {
                                                new String("Failed to delete file ");
                                            } else {
                                                "Failed to delete file ".concat(valueOf7);
                                            }
                                        } else {
                                            String.valueOf(file2.getAbsolutePath()).concat(" deleted.");
                                        }
                                    } catch (SecurityException e13) {
                                        String valueOf8 = String.valueOf(file2.getAbsolutePath());
                                        if (valueOf8.length() == 0) {
                                            new String("Failed to delete file ");
                                        } else {
                                            "Failed to delete file ".concat(valueOf8);
                                        }
                                    }
                                }
                                if (bfdw.mo61513d()) {
                                    break;
                                }
                            }
                            c = bfdp.mo61480c();
                            sb = new StringBuilder();
                            for (i4 = 0; i4 < c.size(); i4++) {
                                if (i4 != 0) {
                                    sb.append(",");
                                }
                                sb.append(c.get(i4));
                            }
                            if (sb.length() > 0) {
                                try {
                                    fileOutputStream = new FileOutputStream(new File(bfdw.f113525c, "uploadedSeq"), false);
                                    try {
                                        fileOutputStream.write(sb.toString().getBytes());
                                        try {
                                            fileOutputStream.close();
                                            break;
                                        } catch (IOException e14) {
                                        }
                                    } catch (IOException e15) {
                                        iOException = e15;
                                        try {
                                            Locale locale7 = Locale.US;
                                            try {
                                                try {
                                                    new Object[1][0] = iOException.getMessage();
                                                    if (fileOutputStream != null) {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (IOException e16) {
                                                        }
                                                    }
                                                    String.valueOf(Thread.currentThread().getName()).concat(" quitting.");
                                                    bfgo.f113789a.mo61666b(this.f113493a.f113525c);
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                th = th;
                                                if (fileOutputStream != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (IOException e17) {
                                                    }
                                                }
                                                try {
                                                    throw th;
                                                } catch (InterruptedException e18) {
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th = th;
                                            if (fileOutputStream != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        if (fileOutputStream != null) {
                                        }
                                        throw th;
                                    }
                                } catch (IOException e19) {
                                    iOException = e19;
                                    fileOutputStream = null;
                                    Locale locale72 = Locale.US;
                                    new Object[1][0] = iOException.getMessage();
                                    if (fileOutputStream != null) {
                                    }
                                    String.valueOf(Thread.currentThread().getName()).concat(" quitting.");
                                    bfgo.f113789a.mo61666b(this.f113493a.f113525c);
                                } catch (Throwable th8) {
                                    th = th8;
                                    fileOutputStream = null;
                                    if (fileOutputStream != null) {
                                    }
                                    throw th;
                                }
                            }
                        } catch (InterruptedException e20) {
                        }
                    }
                    String.valueOf(Thread.currentThread().getName()).concat(" quitting.");
                    bfgo.f113789a.mo61666b(this.f113493a.f113525c);
                }
                m96438a();
                return;
            } catch (NumberFormatException e21) {
                throw new IOException(e21.getMessage());
            } catch (IOException e22) {
                bfdw bfdw5 = this.f113493a;
                String valueOf9 = String.valueOf(e22.getMessage());
                bfdw5.mo61507a(valueOf9.length() == 0 ? new String("Failed to load SessionSummary: ") : "Failed to load SessionSummary: ".concat(valueOf9));
                return;
            } catch (Throwable th9) {
                Throwable th10 = th9;
                bufferedReader.close();
                throw th10;
            }
        } else {
            bfdw bfdw6 = this.f113493a;
            bfdw6.mo61507a(String.valueOf(bfdw6.f113525c).concat(" is locked."));
            return;
        }
        boolean z5 = bfdw.f113534l;
        for (String str8 : bfdp.mo61471a()) {
            bfdw.f113536n.mo61495a(bfdp.f113497b, str8);
        }
        bfgm.mo61669c();
        while (true) {
            bfdw.mo61511c();
            bfdw.f113535m.await();
            z = bfdw.f113526d;
            boolean z42 = !z;
            if (z) {
            }
            c = bfdp.mo61480c();
            sb = new StringBuilder();
            while (i4 < c.size()) {
            }
            if (sb.length() > 0) {
            }
        }
        String.valueOf(Thread.currentThread().getName()).concat(" quitting.");
        bfgo.f113789a.mo61666b(this.f113493a.f113525c);
    }
}

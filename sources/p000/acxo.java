package p000;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentId;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: acxo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acxo {

    /* renamed from: a */
    public final Context f61038a;

    /* renamed from: b */
    public final String f61039b;

    /* renamed from: c */
    private final ssz f61040c;

    /* renamed from: a */
    public static abuu m49957a(UsageInfo usageInfo, String str, long j, List list) {
        abqe abqe;
        int indexOf;
        UsageInfo usageInfo2 = usageInfo;
        String str2 = str;
        long j2 = j;
        List list2 = list;
        DocumentId documentId = usageInfo2.f9694a;
        bxvd da = abuu.f58469m.mo74144da();
        boolean z = false;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abuu abuu = (abuu) da.f164949b;
        str.getClass();
        int i = abuu.f58471a | 1;
        abuu.f58471a = i;
        abuu.f58472b = str2;
        int i2 = i | 2;
        abuu.f58471a = i2;
        abuu.f58473c = j2;
        String str3 = documentId.f9534a;
        str3.getClass();
        int i3 = i2 | 4;
        abuu.f58471a = i3;
        abuu.f58474d = str3;
        String str4 = documentId.f9535b;
        str4.getClass();
        int i4 = i3 | 8;
        abuu.f58471a = i4;
        abuu.f58475e = str4;
        String str5 = documentId.f9536c;
        str5.getClass();
        int i5 = i4 | 16;
        abuu.f58471a = i5;
        abuu.f58476f = str5;
        long j3 = usageInfo2.f9695b;
        abuu.f58471a = i5 | 32;
        abuu.f58477g = j3;
        abuy abuy = (abuy) bmxu.m108565a(abuy.m48299a(usageInfo2.f9696c), abuy.GENERAL_USE);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abuu abuu2 = (abuu) da.f164949b;
        abuu2.f58478h = abuy.f58502g;
        int i6 = abuu2.f58471a | 64;
        abuu2.f58471a = i6;
        boolean z2 = usageInfo2.f9699f;
        abuu2.f58471a = i6 | 512;
        abuu2.f58481k = z2;
        abtc abtc = (abtc) bmxu.m108565a(abtc.m48241a(usageInfo2.f9701h), abtc.UNKNOWN);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abuu abuu3 = (abuu) da.f164949b;
        abuu3.f58482l = abtc.f58200d;
        abuu3.f58471a |= 1024;
        String str6 = abuu3.f58476f;
        DocumentContents documentContents = usageInfo2.f9698e;
        if (documentContents != null) {
            DocumentSection[] documentSectionArr = documentContents.f9530a;
            bxvd da2 = abqe.f57949g.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            abqe abqe2 = (abqe) da2.f164949b;
            str6.getClass();
            abqe2.f57951a |= 2;
            abqe2.f57953c = str6;
            int i7 = 0;
            while (i7 < documentSectionArr.length) {
                DocumentSection documentSection = documentSectionArr[i7];
                bxvd da3 = abqd.f57943e.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = z;
                }
                abqd abqd = (abqd) da3.f164949b;
                abqd.f57945a |= 1;
                abqd.f57946b = i7;
                try {
                    String str7 = documentSection.f9543c;
                    ByteString a = ByteString.m123261a(str7 != null ? str7.getBytes("UTF-8") : documentSection.f9546f);
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = z;
                    }
                    abqd abqd2 = (abqd) da3.f164949b;
                    a.getClass();
                    abqd2.f57945a |= 4;
                    abqd2.f57947c = a;
                    abqo a2 = abzm.m48648a(documentSection.f9544d);
                    bxvd bxvd = (bxvd) a2.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) a2);
                    if (documentSection.f9545e != DocumentSection.f9541a) {
                        int i8 = documentSection.f9545e;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = z;
                        }
                        abqo abqo = (abqo) bxvd.f164949b;
                        bxvu bxvu = abqo.f57974i;
                        abqo.f57977a |= 512;
                        abqo.f57989n = i8;
                    }
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = z;
                    }
                    abqd abqd3 = (abqd) da3.f164949b;
                    abqo abqo2 = (abqo) bxvd.mo74062i();
                    abqo2.getClass();
                    abqd3.f57948d = abqo2;
                    abqd3.f57945a |= 32;
                    if (celu.m137198b() && documentContents.f9533d != null && ".private:action".equals(documentSection.f9544d.f9646a)) {
                        try {
                            cixm cixm = (cixm) GeneratedMessageLite.m124016a(cixm.f191686d, documentSection.f9546f, bxus.m123744c());
                            bxvd da4 = cixn.f191691g.mo74144da();
                            String str8 = documentContents.f9533d.name;
                            if (da4.f164950c) {
                                da4.mo74035c();
                                da4.f164950c = z;
                            }
                            cixn cixn = (cixn) da4.f164949b;
                            str8.getClass();
                            cixn.f191693a |= 2;
                            cixn.f191695c = str8;
                            cixn cixn2 = (cixn) da4.mo74062i();
                            bxvd da5 = cixk.f191681d.mo74144da();
                            if (da5.f164950c) {
                                da5.mo74035c();
                                da5.f164950c = z;
                            }
                            cixk cixk = (cixk) da5.f164949b;
                            "account".getClass();
                            int i9 = cixk.f191683a | 1;
                            cixk.f191683a = i9;
                            cixk.f191684b = "account";
                            cixn2.getClass();
                            cixk.f191685c = cixn2;
                            cixk.f191683a = i9 | 2;
                            bxvd bxvd2 = (bxvd) cixm.mo74142c(5);
                            bxvd2.mo73625a((GeneratedMessageLite) cixm);
                            cixl cixl = (cixl) bxvd2;
                            cixl.mo86632a((cixk) da5.mo74062i());
                            ByteString aL = ((cixm) cixl.mo74062i()).mo73639aL();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            abqd abqd4 = (abqd) da3.f164949b;
                            aL.getClass();
                            abqd4.f57945a |= 4;
                            abqd4.f57947c = aL;
                        } catch (bxwf e) {
                            absg.m48191b("Unabled to parse the provided action.");
                        }
                    }
                    da2.mo74079l(da3);
                    i7++;
                    z = false;
                } catch (UnsupportedEncodingException e2) {
                    throw new IllegalStateException(e2);
                }
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            abqe abqe3 = (abqe) da2.f164949b;
            abqe3.f57951a |= 8;
            abqe3.f57956f = j2;
            abqe = (abqe) da2.mo74062i();
        } else {
            abqe = abqe.f57949g;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abuu abuu4 = (abuu) da.f164949b;
        abqe.getClass();
        abuu4.f58479i = abqe;
        abuu4.f58471a |= 128;
        if (!(list2 == null || (indexOf = list2.indexOf(str2)) == -1)) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abuu abuu5 = (abuu) da.f164949b;
            abuu5.f58471a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            abuu5.f58480j = indexOf;
        }
        return (abuu) da.mo74062i();
    }

    /* renamed from: b */
    public final void mo33214b() {
        this.f61040c.mo26064a();
    }

    public acxo(Context context, String str) {
        this.f61040c = new ssz(context, str);
        this.f61038a = context;
        this.f61039b = str;
    }

    /* renamed from: a */
    public static Iterator m49958a(ParcelFileDescriptor parcelFileDescriptor) {
        bxxk bxxk = (bxxk) abuu.f58469m.mo74142c(7);
        if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
            return Collections.emptyList().iterator();
        }
        return new sta(new FileInputStream(parcelFileDescriptor.getFileDescriptor()), parcelFileDescriptor.getStatSize(), abuu.class, bxxk);
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo33212a() {
        ParcelFileDescriptor parcelFileDescriptor;
        ssz ssz = this.f61040c;
        synchronized (ssz.f45111a) {
            ssz.mo26064a();
            File fileStreamPath = ssz.f45113c.getFileStreamPath(ssz.f45112b);
            parcelFileDescriptor = null;
            if (fileStreamPath.exists()) {
                try {
                    parcelFileDescriptor = ParcelFileDescriptor.open(fileStreamPath, 268435456);
                    if (!fileStreamPath.delete()) {
                        Log.e("ProtoLiteFileLogger", "Failed to delete file.");
                    }
                } catch (FileNotFoundException e) {
                    Log.e("ProtoLiteFileLogger", "Unexpected FileNotFoundException when reading file.");
                }
            }
        }
        return parcelFileDescriptor;
    }

    /* renamed from: a */
    public final boolean mo33213a(UsageInfo[] usageInfoArr, String str, long j, List list, Runnable runnable) {
        boolean z;
        ArrayList arrayList = new ArrayList(usageInfoArr.length);
        boolean z2 = false;
        for (UsageInfo usageInfo : usageInfoArr) {
            if (usageInfo != null) {
                if (usageInfo.f9696c != 4) {
                    int i = usageInfo.f9701h;
                    if (i == 0) {
                        absg.m48185a("Dropping unknown event status from %s", str);
                    } else if (i == 2 && usageInfo.f9698e == null) {
                        absg.m48184a("Dropping viewEnd event without a document.");
                    } else {
                        arrayList.add(m49957a(usageInfo, str, j, list));
                    }
                } else {
                    absg.m48185a("Dropping context-only usage from %s", str);
                }
            }
        }
        ssz ssz = this.f61040c;
        ByteBuffer a = stb.m36276a(arrayList, false);
        synchronized (ssz.f45111a) {
            synchronized (ssz.f45111a) {
                if (ssz.f45114d == null) {
                    try {
                        ssz.f45114d = ssz.f45113c.openFileOutput(ssz.f45112b, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
                    } catch (FileNotFoundException e) {
                        Log.e("ProtoLiteFileLogger", "Failed to open usage log file", e);
                    }
                }
            }
            try {
                FileChannel channel = ssz.f45114d.getChannel();
                if (channel.size() + ((long) a.capacity()) >= 102400) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    channel.write(a);
                    ssz.f45114d.flush();
                    z2 = true;
                } catch (IOException e2) {
                }
            } catch (IOException e3) {
                z = false;
            }
        }
        if (runnable != null && z) {
            runnable.run();
            return z2;
        }
        return z2;
    }
}

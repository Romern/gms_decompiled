package p000;

import com.felicanetworks.mfc.Block;
import com.felicanetworks.mfc.BlockList;
import com.felicanetworks.mfc.CyclicData;
import com.felicanetworks.mfc.Data;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaException;
import com.felicanetworks.mfc.RandomData;
import java.util.ArrayList;

/* renamed from: cikk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cikk implements brgm {

    /* renamed from: a */
    private final brep f190529a;

    public cikk(brep brep) {
        this.f190529a = brep;
    }

    /* renamed from: a */
    static final byte[][] m150517a(Felica felica, BlockList blockList) {
        byte[] bArr;
        Data[] read = felica.read(blockList);
        int length = read.length;
        ArrayList arrayList = new ArrayList(length);
        for (Data data : read) {
            if (data instanceof RandomData) {
                bArr = ((RandomData) data).getBytes();
            } else {
                bArr = ((CyclicData) data).getBytes();
            }
            int length2 = bArr.length;
            byte[] bArr2 = new byte[length2];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[(length2 - 1) - i] = bArr[i];
            }
            arrayList.add(bArr2);
        }
        return (byte[][]) arrayList.toArray(new byte[arrayList.size()][]);
    }

    /* renamed from: b */
    static final int m150518b(Felica felica) {
        BlockList blockList = new BlockList();
        blockList.add(new Block(16527, 0));
        try {
            felica.read(blockList);
            return 2;
        } catch (FelicaException e) {
            if (e.getType() == 11) {
                return 1;
            }
            throw e;
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo69520a(Felica felica) {
        throw null;
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo69522a(Object obj) {
        throw null;
    }

    /* renamed from: a */
    public final void mo69521a(bret bret) {
        this.f190529a.mo49931a(new bres(bret));
    }
}

package p000;

import com.felicanetworks.mfc.Block;
import com.felicanetworks.mfc.BlockList;
import com.felicanetworks.mfc.Felica;
import com.felicanetworks.mfc.FelicaException;
import java.lang.reflect.Array;

/* renamed from: cikj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class cikj extends cikk {

    /* renamed from: a */
    public final brep f190528a;

    public cikj(brep brep) {
        super(brep);
        this.f190528a = brep;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo69520a(Felica felica) {
        byte[][] bArr;
        srn srn = atgf.f90279a;
        BlockList blockList = new BlockList();
        blockList.add(new Block(16523, 0));
        blockList.add(new Block(16523, 2));
        blockList.add(new Block(16523, 4));
        blockList.add(new Block(16587, 1));
        blockList.add(new Block(16587, 2));
        blockList.add(new Block(16715, 1));
        blockList.add(new Block(16715, 2));
        try {
            bArr = m150517a(felica, blockList);
        } catch (FelicaException e) {
            int type = e.getType();
            StringBuilder sb = new StringBuilder(77);
            sb.append("BaseCardInformationOperation#onFelicaOpened read FeliCa exception:");
            sb.append(type);
            sb.toString();
            if (e.getType() == 50 || e.getType() == 11) {
                bArr = (byte[][]) Array.newInstance(byte.class, 0, 0);
            } else {
                throw e;
            }
        }
        cikn cikn = new cikn();
        cikn.f190532a = bArr;
        if (bArr.length > 0) {
            cikn.f190533b = m150518b(felica);
        }
        return cikn;
    }
}

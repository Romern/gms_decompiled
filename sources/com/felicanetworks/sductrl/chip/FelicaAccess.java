package com.felicanetworks.sductrl.chip;

import com.felicanetworks.cmnlib.AppContext;
import com.felicanetworks.cmnlib.FunctionCodeInterface;
import com.felicanetworks.cmnlib.p005sg.SgMgr;
import com.felicanetworks.cmnlib.util.CommonUtil;
import com.felicanetworks.cmnlib.util.Synchronizer;
import com.felicanetworks.mfc.AppInfo;
import com.felicanetworks.mfc.DeviceList;
import com.felicanetworks.mfc.FSC;
import com.felicanetworks.mfc.FSCEventListener;
import com.felicanetworks.mfc.FelicaEventListener;
import com.felicanetworks.mfc.FelicaException;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FelicaAccess extends Synchronizer implements FunctionCodeInterface {
    protected static final int CARRIER_SIZE = 3;
    protected static final int CARRIER_START_POS = 2;
    protected static final int CODESTR_BASEMENT = 16;
    private AppContext context;
    protected FelicaAccessException exception;
    protected int status;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ActivateFelicaListener implements FelicaEventListener {
        protected ActivateFelicaListener() {
        }

        public void errorOccurred(int i, String str, AppInfo appInfo) {
            FelicaAccess.this.exception = new FelicaAccessException(i, str, appInfo);
            FelicaAccess.this.notifyThread();
        }

        public void finished() {
            FelicaAccess felicaAccess = FelicaAccess.this;
            felicaAccess.exception = null;
            felicaAccess.notifyThread();
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class FscStartListener implements FSCEventListener {
        protected FscStartListener() {
        }

        public void errorOccurred(int i, String str) {
            FelicaAccess.this.exception = new FelicaAccessException(i, str);
            FelicaAccess.this.notifyThread();
        }

        public void finished(int i) {
            FelicaAccess felicaAccess = FelicaAccess.this;
            felicaAccess.exception = null;
            felicaAccess.status = i;
            felicaAccess.notifyThread();
        }

        public byte[] operationRequested(int i, String str, byte[] bArr) {
            throw new Exception("");
        }
    }

    public FelicaAccess(AppContext appContext, Object obj) {
        super(obj);
        this.context = appContext;
    }

    public boolean checkCarrierInContainer(byte[] bArr) {
        return Arrays.equals(getCarrierInContainer(bArr), CommonUtil.hexStringToBin((String) this.context.sgMgr.getSgValue(SgMgr.KEY_MFC_CARRIER_CODE)));
    }

    public int checkChipStatus(byte[] bArr) {
        if (checkCarrierInContainer(bArr)) {
            return !containsSystemCode(CommonUtil.toInt((byte[]) this.context.sgMgr.getSgValue(54), true)) ? 2 : 3;
        }
        if (!hasInitializedContainer(bArr)) {
            return 4;
        }
        return 1;
    }

    public boolean containsSystemCode(int i) {
        for (int i2 : this.context.felica.getSystemCodeList()) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public void felicaUseEnd() {
        try {
            this.context.felica.close();
            this.context.felica.inactivateFelica();
        } catch (FelicaException e) {
        }
    }

    public void felicaUseStart() {
        ActivateFelicaListener activateFelicaListener = new ActivateFelicaListener();
        AppContext appContext = this.context;
        appContext.felica.activateFelica(appContext.permitList, activateFelicaListener);
        waitThread();
        FelicaAccessException felicaAccessException = this.exception;
        if (felicaAccessException == null) {
            this.context.felica.open();
            AppContext appContext2 = this.context;
            appContext2.felica.setTimeout(((Integer) appContext2.sgMgr.getSgValue(SgMgr.KEY_MFC_TIMEOUT)).intValue());
            AppContext appContext3 = this.context;
            appContext3.felica.setRetryCount(((Integer) appContext3.sgMgr.getSgValue(SgMgr.KEY_MFC_RETRY_CNT)).intValue());
            return;
        }
        throw felicaAccessException;
    }

    public byte[] getCarrierInContainer(byte[] bArr) {
        byte[] bArr2 = new byte[3];
        System.arraycopy(bArr, 2, bArr2, 0, 3);
        return bArr2;
    }

    public ChipMgrInfoData getChipMgrInfo() {
        this.context.felica.select(Integer.parseInt(this.context.sgMgr.getManageSystemCode(), 16));
        byte[] iDm = this.context.felica.getIDm();
        byte[] containerIssueInformation = this.context.felica.getContainerIssueInformation();
        return new ChipMgrInfoData(iDm, CommonUtil.binToHexString(CommonUtil.changeEndian(this.context.felica.getICCode())), containerIssueInformation, getCarrierInContainer(containerIssueInformation));
    }

    public int getChipStatus() {
        this.context.felica.select(Integer.parseInt(this.context.sgMgr.getManageSystemCode(), 16));
        return checkChipStatus(this.context.felica.getContainerIssueInformation());
    }

    public int getClassCode() {
        return 2;
    }

    public int getFunctionCode() {
        return 3;
    }

    public boolean hasInitializedContainer(byte[] bArr) {
        for (byte b : bArr) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }

    public int startOnline(String str) {
        AppContext appContext = this.context;
        FSC fsc = appContext.fsc;
        fsc.setFelica(appContext.felica);
        fsc.setDeviceList(new DeviceList());
        fsc.setFSCEventListener(new FscStartListener());
        fsc.start(str);
        waitThread();
        FelicaAccessException felicaAccessException = this.exception;
        if (felicaAccessException == null) {
            return this.status;
        }
        throw felicaAccessException;
    }
}

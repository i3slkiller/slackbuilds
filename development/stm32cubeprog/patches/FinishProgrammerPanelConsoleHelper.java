package com.st.CustomPanels;

import java.util.Properties;

import com.izforge.izpack.api.data.InstallData;
import com.izforge.izpack.installer.console.AbstractConsolePanel;
import com.izforge.izpack.util.Console;


public class FinishProgrammerPanelConsoleHelper extends AbstractConsolePanel {
    public FinishProgrammerPanelConsoleHelper()
    {
        super(null);
    }

    @Override
    public boolean run(InstallData installData, Properties properties)
    {
        return true;
    }

    @Override
    public boolean run(InstallData installData, Console console)
    {
        return true;
    }
}

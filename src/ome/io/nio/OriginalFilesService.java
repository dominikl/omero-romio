/*
 * ome.io.nio.OriginalFilesService
 *
 *------------------------------------------------------------------------------
 *
 *  Copyright (C) 2005 Open Microscopy Environment
 *      Massachusetts Institute of Technology,
 *      National Institutes of Health,
 *      University of Dundee
 *
 *
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *------------------------------------------------------------------------------
 */
package ome.io.nio;

import java.io.FileNotFoundException;

import ome.model.core.OriginalFile;


/** 
 * Raw file service which provides access to <code>FileBuffers</code>. 
 *
 * @author  Chris Allan &nbsp;&nbsp;&nbsp;&nbsp;
 *              <a href="mailto:callan@blackcat.ca">callan@blackcat.ca</a>
 * @version 3.0
 * <small>
 * (<b>Internal version:</b> $Revision: 1.2 $ $Date: 2005/06/08 15:21:59 $)
 * </small>
 * @since OMERO3.0
 */
public class OriginalFilesService extends AbstractFileSystemService
{

    public OriginalFilesService(String path)
    {
        super(path);
    }
    
    public FileBuffer getFileBuffer(OriginalFile file)
    {
        return new FileBuffer(getFilesPath(file.getId()), file);
    }
}
